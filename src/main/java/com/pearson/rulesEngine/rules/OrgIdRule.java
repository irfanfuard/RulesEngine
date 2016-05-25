package com.pearson.rulesEngine.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.pearson.rulesEngine.domain.Offer;

@Rule(name = "OrgIdRule",
description = "Validate organization rule")
public class OrgIdRule {
	String[] orgIds;
	Offer offer;
	public String[] getOrgIds() {
		return orgIds;
	}
	public void setOrgIds(String[] orgIds) {
		this.orgIds = orgIds;
	}

	
	
	
	@Condition
	public boolean checkOrgId(){
		boolean equals=false;
		for(int i=0;i<orgIds.length;i++){
			if(orgIds[i].equals(offer.getOrgId())){
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
	public void validOrgId(){
		
		System.out.println("Offer is in valid Organization");
	}
}
