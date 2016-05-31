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
@Rule(name = "OrgIdRule",
description = "Validate organization rule")
public class OrgIdRule {
	
	String[] orgIds;
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
	 * @return the orgIds
	 */
	public String[] getOrgIds() {
		return orgIds;
	}

	/**
	 * @param orgIds the orgIds to set
	 */
	public void setOrgIds(String[] orgIds) {
		this.orgIds = orgIds;
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

	@Condition
	public boolean checkOrgId(){
		boolean equals=false;
		for(int i=0;i<orgIds.length;i++){
			if(orgIds[i].equals(offerDto.getOrgId())){
				equals=true;
			}
		}
		return equals;
	}

	@Action
	public void validOrgId(){
		setValid(true);
		System.out.println("Offer is in valid Organization");
	}
}
