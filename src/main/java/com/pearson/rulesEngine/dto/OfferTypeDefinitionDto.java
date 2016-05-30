package com.pearson.rulesEngine.dto;

/**
 * Offer Type Definition Domain
 * @author UFUARIR
 *
 */
public class OfferTypeDefinitionDto {

	private Double price;
	private String currency;
	private Integer subscriptionDuration;
	private Integer isbn;
	
	
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the subscriptionDuration
	 */
	public Integer getSubscriptionDuration() {
		return subscriptionDuration;
	}
	/**
	 * @param subscriptionDuration the subscriptionDuration to set
	 */
	public void setSubscriptionDuration(Integer subscriptionDuration) {
		this.subscriptionDuration = subscriptionDuration;
	}
	/**
	 * @return the isbn
	 */
	public Integer getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
}
