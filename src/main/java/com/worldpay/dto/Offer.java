package com.worldpay.dto;

import java.time.LocalDate;

public class Offer {
	
	Integer offerId;
	
	String offerName;
	
	LocalDate offerExpiryDate;

	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public LocalDate getOfferExpiryDate() {
		return offerExpiryDate;
	}

	public void setOfferExpiryDate(LocalDate offerExpiryDate) {
		this.offerExpiryDate = offerExpiryDate;
	} 	

}
