package com.pearson.rulesEngine.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

/**
 * A POJO which is mapped with orgId rule in the bean xml
 * @author UGUNAUD
 *
 */
@Rule(name = "OrgIdRule",
description = "Validate organization rule")
public class OrgIdRule extends BaseRule<Integer>{

	/* (non-Javadoc)
	 * @see com.pearson.rulesEngine.rules.BaseRule#condition()
	 */
	@Override
	@Condition
	public boolean condition() {
		boolean equals=false;
		
		//If the country code of the specific offer matches any of the codes mentioned in the bean xml return true
		for(int i=0;i<beanValues.length;i++){
			if(beanValues[i]==offer.getOrgId()){
				equals=true;
			}else{
				setValid(false);
			}
		}
		return equals;
	}

	/* (non-Javadoc)
	 * @see com.pearson.rulesEngine.rules.BaseRule#action()
	 */
	@Override
	@Action
	public void action() {
		System.out.println("OrgId Rule validated");
		super.action();
	}
	
}
