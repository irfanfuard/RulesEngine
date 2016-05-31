package com.pearson.rulesEngine.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.pearson.rulesEngine.dto.OfferDto;

/**Rule POJO which mapped with Rulebean in RulesBean
 * If this rule passed valid will give True
 * @author UGUNAUD
 *
 */
@Rule(name = "CountryRule",
description = "Validate country rule")
public class CountryRule {

	String[] countries;
	OfferDto offerDto;
	boolean valid;
	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * @param valid the valid to set
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	/**
	 * @return the countries
	 */
	public String[] getCountries() {
		return countries;
	}

	/**
	 * @param countries the countries to set
	 */
	public void setCountries(String[] countries) {
		this.countries = countries;
	}

	/**
	 * @return the offerDto
	 */
	public OfferDto getOfferDto() {
		return offerDto;
	}

	/**
	 * @param offerDto the offerDto to set
	 */
	public void setOfferDto(OfferDto offerDto) {
		this.offerDto = offerDto;
	}

	public CountryRule(){
		
	}
	
	@Condition
	public boolean checkCountry(){
		boolean equals=false;
		for(int i=0;i<countries.length;i++){
			if(countries[i].equals(offerDto.getCountryCode())){
				equals=true;
			}
		}
		return equals;
	}

	@Action
	public void validCountry(){
		setValid(true);
		System.out.println("Offer is in valid country");
	}
}
