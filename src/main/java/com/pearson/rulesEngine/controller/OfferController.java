package com.pearson.rulesEngine.controller;

import org.easyrules.api.RulesEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pearson.rulesEngine.domain.Offer;
import com.pearson.rulesEngine.rules.CountryRule;
import com.pearson.rulesEngine.rules.OrgIdRule;

@RestController
public class OfferController {

	@RequestMapping(value="/offer",method=RequestMethod.GET)
	public Offer getOffer(@RequestParam(value="userRole")String userRole,@RequestParam(value="countryCode")String countryCode,@RequestParam(value="orgId")String orgId){
		
		
	
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pearson/rulesEngine/xml/application-context.xml");
		RulesEngine rulesEngine = (RulesEngine) context.getBean("rulesEngine");
		Offer offer =(Offer)context.getBean("Offer");
		CountryRule countryRule=(CountryRule)context.getBean("CountryRule");
		OrgIdRule orgIdRule=(OrgIdRule)context.getBean("OrgIdRule");
		
		 offer.setCountryCode(countryCode);
		 offer.setOrgId(orgId);
		 offer.setUserRole(userRole);
		 
		 rulesEngine.registerRule(countryRule);
		 rulesEngine.registerRule(orgIdRule);
		 
		 rulesEngine.fireRules();
			
		return offer;
	}
}
