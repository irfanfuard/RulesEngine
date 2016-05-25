package com.pearson.rulesEngine.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.pearson.rulesEngine.domain.Offer;

@Rule(name = "CountryRule",
description = "Validate country rule")
public class CountryRule {

	String[] countries;
	Offer offer;
	
	public String[] getCountries() {
		return countries;
	}

	public void setCountries(String[] countries) {
		this.countries = countries;
	}

	public CountryRule(){
		
	}
	
	@Condition
	public boolean checkCountry(){
		boolean equals=false;
		for(int i=0;i<countries.length;i++){
			if(countries[i].equals(offer.getCountryCode())){
				equals=true;
			}
		}
		return equals;
	}
	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	@Action
	public void validCountry(){
		
		System.out.println("Offer is in valid country");
	}
}
