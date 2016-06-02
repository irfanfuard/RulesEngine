package com.pearson.rulesEngine.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

/**
 * A POJO which is mapped with country rule in the bean xml
 * @author UGUNAUD
 *
 */
@Rule(name = "CountryRule",
description = "Validate country rule")
public class CountryRule extends BaseRule<String>{

	/* (non-Javadoc)
	 * @see com.pearson.rulesEngine.rules.BaseRule#condition()
	 */
	@Override
	@Condition
	public boolean condition() {
		boolean equals=false;
		
		//If the country code of the specific offer matches any of the codes mentioned in the bean xml return true
		for(int i=0;i<beanValues.length;i++){
			if(beanValues[i].equals(offer.getCountryCode())){
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
		System.out.println("Country Rule validated");
		super.action();
	}


}
