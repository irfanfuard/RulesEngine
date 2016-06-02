package com.pearson.rulesEngine.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.pearson.rulesEngine.dto.OfferDto;

/**
 * Base class of Rules
 * 
 * @author UGUNAUD
 * @param <E>
 *
 */

@Rule(name = "BaseRule", description = "Base Rule class")
public class BaseRule<E> {

	boolean valid;
	OfferDto offer;
	E[] beanValues;
	
	/**
	 * @return the offer
	 */
	public OfferDto getOffer() {
		return offer;
	}

	/**
	 * @return the values
	 */
	public E[] getValues() {
		return beanValues;
	}

	/**
	 * @param values the values to set
	 */
	public void setValues(E[] values) {
		this.beanValues = values;
	}

	/**
	 * @param offer the offer to set
	 */
	public void setOffer(OfferDto offer) {
		this.offer = offer;
	}

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
	 * runs the logic to check the validity
	 */
	@Condition
	public boolean condition() {
		boolean condition = false;

		return condition;
	}

	/**
	 * runs after,only if condition() returns TRUE
	 */
	@Action
	public void action() {
		setValid(true);
	}
}
