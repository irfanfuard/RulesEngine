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
import com.pearson.rulesEngine.rules.BaseRule;
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
	 * Get user context from route parameters, Register and check rules through the bean xml and return valid offers to the user
	 *
	 */
	@SuppressWarnings({ "resource" })
	@RequestMapping(value = "/offer", method = RequestMethod.GET)
	public List<OfferDto> getOffer(
			@RequestParam(value = "userRole") String userRole) throws IOException,
			ParseException {
		
		//Specify the rules engine bean xml file path which  is in the resources folder
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"rules-engine-bean.xml");
		
		//Initialize rules engine with the rules that needs to be checked
		RulesEngine rulesEngine = (RulesEngine) context.getBean("rulesEngine");
		BaseRule<String> countryRule = (CountryRule) context.getBean("CountryRule");
		BaseRule<Integer> orgIdRule = (OrgIdRule) context.getBean("OrgIdRule");

		List<OfferDto> jsonOfferList = new ArrayList<OfferDto>(); // A list object to convert offer json object to a pojo object list to send it to the rules engine bean xml

		try {
			//Add details to the Offer DTO list from the Offer json
			final FileReader reader = new FileReader(
					"src/main/resources/offers.json");
			final JSONParser parser = new JSONParser();
			final String offerJson = (String) parser.parse(reader).toString();

			Type listType = new TypeToken<ArrayList<OfferDto>>() {
			}.getType();
			jsonOfferList = new Gson().fromJson(offerJson, listType);

		} catch (Exception e) {
			System.out.println(e);
		}
		
		List<OfferDto> userOfferList = new ArrayList<OfferDto>(); // A new List object to add the valid offers to be displayed to the user
		
		//Check User context and validate rules through the bean xml
		for (OfferDto offer : jsonOfferList) {

			rulesEngine.clearRules();
			//countryRule.setOfferDto(offer);
			orgIdRule.setOffer(offer);
			countryRule.setOffer(offer);
			
			//If user role is a student apply country rule
			if (userRole.equalsIgnoreCase("Student")) {
				rulesEngine.registerRule(countryRule);
				rulesEngine.fireRules();
				
				//If country rule is valid for the specific offer add the offer to the newly created offer list
				if (countryRule.isValid()) {
					userOfferList.add(offer);

				}
				//If user role is a teacher apply both country and orgId rules
			} else if (userRole.equalsIgnoreCase("Teacher")) {
				rulesEngine.registerRule(countryRule);
				rulesEngine.registerRule(orgIdRule);
				
				rulesEngine.fireRules();
				
				//If country and orgId rule is valid for the specific offer add the offer to the newly created offer list
				if (countryRule.isValid() && orgIdRule.isValid()) {
					userOfferList.add(offer);

				}
			}


			rulesEngine.clearRules();
		}
		
		return userOfferList;
	}

}
