package com.pearson.rulesEngine.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.pearson.rulesEngine.dto.OfferDto;

/**
 * A POJO which is mapped with orgId rule in the bean xml
 * @author UGUNAUD
 *
 */
@Rule(name = "OrgIdRule",
description = "Validate organization rule")
public class OrgIdRule {
	
	Integer[] orgIds;
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
	public Integer[] getOrgIds() {
		return orgIds;
	}

	/**
	 * @param orgIds the orgIds to set
	 */
	public void setOrgIds(Integer[] orgIds) {
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

	//Check if the orgId rule is valid or not
	@Condition
	public boolean checkOrgId(){
		
		boolean equals=false;
		//If the Org Id of the specific offer matches any of the codes mentioned in the bean xml return true
		for(int i=0;i<orgIds.length;i++){
			if(orgIds[i] == offerDto.getOrgId()){
				equals=true;
			}else{
				setValid(false);
			}
		}
		return equals;
	}

	//Perform action
	@Action
	public void validOrgId(){
		setValid(true);
		System.out.println("Offer is in valid Organization");
	}
}
