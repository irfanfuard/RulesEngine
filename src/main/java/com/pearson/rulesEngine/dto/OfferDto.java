package com.pearson.rulesEngine.dto;

import java.util.Date;

/**
 * Offer DTO
 * @author UFUARIR
 *
 */
public class OfferDto {

	private String offerId;
	private String title;
	private String alternateTitle; 	
	private Date dateCreated;
	private Date dateModified;
	private String createdBy;
	private String lastModifiedBy;
	private Date offerStartDate;
	private Date offerEndDate;
	private String description;
	private String offerStatus;
	private Integer orgId;
	private String countryCode;
	private OfferTypeDto offerType;
	private String productId;
	private String sourceSystem;
	
	
	/**
	 * @return the offerId
	 */
	public String getOfferId() {
		return offerId;
	}
	/**
	 * @param offerId the offerId to set
	 */
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the alternateTitle
	 */
	public String getAlternateTitle() {
		return alternateTitle;
	}
	/**
	 * @param alternateTitle the alternateTitle to set
	 */
	public void setAlternateTitle(String alternateTitle) {
		this.alternateTitle = alternateTitle;
	}
	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	/**
	 * @return the dateModified
	 */
	public Date getDateModified() {
		return dateModified;
	}
	/**
	 * @param dateModified the dateModified to set
	 */
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the lastModifiedBy
	 */
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	/**
	 * @param lastModifiedBy the lastModifiedBy to set
	 */
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	/**
	 * @return the offerStartDate
	 */
	public Date getOfferStartDate() {
		return offerStartDate;
	}
	/**
	 * @param offerStartDate the offerStartDate to set
	 */
	public void setOfferStartDate(Date offerStartDate) {
		this.offerStartDate = offerStartDate;
	}
	/**
	 * @return the offerEndDate
	 */
	public Date getOfferEndDate() {
		return offerEndDate;
	}
	/**
	 * @param offerEndDate the offerEndDate to set
	 */
	public void setOfferEndDate(Date offerEndDate) {
		this.offerEndDate = offerEndDate;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the offerStatus
	 */
	public String getOfferStatus() {
		return offerStatus;
	}
	/**
	 * @param offerStatus the offerStatus to set
	 */
	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}
	/**
	 * @return the orgId
	 */
	public Integer getOrgId() {
		return orgId;
	}
	/**
	 * @param orgId the orgId to set
	 */
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the offerType
	 */
	public OfferTypeDto getOfferType() {
		return offerType;
	}
	/**
	 * @param offerType the offerType to set
	 */
	public void setOfferType(OfferTypeDto offerType) {
		this.offerType = offerType;
	}
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the sourceSystem
	 */
	public String getSourceSystem() {
		return sourceSystem;
	}
	/**
	 * @param sourceSystem the sourceSystem to set
	 */
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
}
