package com.pearson.rulesEngine.controller;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.easyrules.api.RulesEngine;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pearson.rulesEngine.dto.OfferDto;
import com.pearson.rulesEngine.rules.CountryRule;
import com.pearson.rulesEngine.rules.OrgIdRule;

/**
 * Collection of routes and related controlelrs for offers
 * 
 * @author UGUNAUD
 *
 */

@RestController
public class OfferController {

	/**
	 * Get user context from route parameters ,regisgter rules against user
	 * context and return valid offers for the user
	 *
	 */
	@SuppressWarnings({ "resource" })
	@RequestMapping(value = "/offer", method = RequestMethod.GET)
	public List<OfferDto> getOffer(
			@RequestParam(value = "userRole") String userRole,
			@RequestParam(value = "countryCode") String countryCode,
			@RequestParam(value = "orgId") String orgId) throws IOException,
			ParseException {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"rules-engine-bean.xml");

		RulesEngine rulesEngine = (RulesEngine) context.getBean("rulesEngine");
		CountryRule countryRule = (CountryRule) context.getBean("CountryRule");
		OrgIdRule orgIdRule = (OrgIdRule) context.getBean("OrgIdRule");

		List<OfferDto> offerList = new ArrayList<OfferDto>();
		List<OfferDto> userOfferList = new ArrayList<OfferDto>();

		try {
			final FileReader reader = new FileReader(
					"src/main/resources/offers.json");
			final JSONParser parser = new JSONParser();
			final String offerJson = (String) parser.parse(reader).toString();

			Type listType = new TypeToken<ArrayList<OfferDto>>() {
			}.getType();
			offerList = new Gson().fromJson(offerJson, listType);

		} catch (Exception e) {
			System.out.println(e);
		}
		for (OfferDto offer : offerList) {

			rulesEngine.clearRules();
			countryRule.setOfferDto(offer);
			orgIdRule.setOfferDto(offer);

			if (userRole.equalsIgnoreCase("Student")) {
				rulesEngine.registerRule(countryRule);

			} else if (userRole.equalsIgnoreCase("Teacher")) {
				rulesEngine.registerRule(countryRule);
				rulesEngine.registerRule(orgIdRule);
			}
			rulesEngine.fireRules();

			if (countryRule.isValid()) {
				userOfferList.add(offer);

			}

			rulesEngine.clearRules();

		}
		return userOfferList;
	}

}
