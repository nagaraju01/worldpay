package com.worldpay.dto;

public class OfferRequest {
	
	ProductOffer productOffer;
	
	ServiceOffer serviceOffer;

	public ProductOffer getProductOffer() {
		return productOffer;
	}

	public void setProductOffer(ProductOffer productOffer) {
		this.productOffer = productOffer;
	}

	public ServiceOffer getServiceOffer() {
		return serviceOffer;
	}

	public void setServiceOffer(ServiceOffer serviceOffer) {
		this.serviceOffer = serviceOffer;
	}

}
