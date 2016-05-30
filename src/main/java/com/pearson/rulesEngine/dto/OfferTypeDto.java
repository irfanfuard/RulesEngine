package com.pearson.rulesEngine.dto;

/**
 * Offer Type DTO
 * @author UFUARIR
 *
 */
public class OfferTypeDto {

	private Integer offerTypeId;
	private String offerTypeCode;
	private OfferTypeDefinitionDto offerTypeDefinition;
	
	
	/**
	 * @return the offerTypeId
	 */
	public Integer getOfferTypeId() {
		return offerTypeId;
	}
	/**
	 * @param offerTypeId the offerTypeId to set
	 */
	public void setOfferTypeId(Integer offerTypeId) {
		this.offerTypeId = offerTypeId;
	}
	/**
	 * @return the offerTypeCode
	 */
	public String getOfferTypeCode() {
		return offerTypeCode;
	}
	/**
	 * @param offerTypeCode the offerTypeCode to set
	 */
	public void setOfferTypeCode(String offerTypeCode) {
		this.offerTypeCode = offerTypeCode;
	}
	/**
	 * @return the offerTypeDefinition
	 */
	public OfferTypeDefinitionDto getOfferTypeDefinition() {
		return offerTypeDefinition;
	}
	/**
	 * @param offerTypeDefinition the offerTypeDefinition to set
	 */
	public void setOfferTypeDefinition(OfferTypeDefinitionDto offerTypeDefinition) {
		this.offerTypeDefinition = offerTypeDefinition;
	}
}
