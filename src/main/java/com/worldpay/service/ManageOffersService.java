package com.worldpay.service;

import java.util.List;

import com.worldpay.dto.Offer;
import com.worldpay.dto.OfferRequest;
import com.worldpay.dto.OfferResponse;

public interface ManageOffersService {

	OfferResponse createOffer(OfferRequest offerRequest);

	OfferResponse deleteOffer(String iD);
	
	List<Offer> getOffers();

}
