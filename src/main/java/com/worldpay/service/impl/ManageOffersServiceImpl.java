package com.worldpay.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.worldpay.dto.Offer;
import com.worldpay.dto.OfferRequest;
import com.worldpay.dto.OfferResponse;
import com.worldpay.dto.ProductOffer;
import com.worldpay.service.ManageOffersService;

@Service("manageOffersServiceImpl")
public class ManageOffersServiceImpl implements ManageOffersService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ManageOffersServiceImpl.class);

	public OfferResponse createOffer(OfferRequest offerRequest) {
		OfferResponse response = new OfferResponse();
		// TODO: save into DB
		
		response.setResult(true);
		return response;
	}

	public OfferResponse deleteOffer(String iD) {
		OfferResponse response = new OfferResponse();
		// TODO: delete an offer from DB
		
		response.setResult(true);
		return response;
	}

	public List<Offer> getOffers() {
		// TODO: delete an offer from DB
		
		// Mock object
		List<Offer> offers = new ArrayList<>();
		ProductOffer prodOffer = new ProductOffer();
		prodOffer.setOfferId(123);
		prodOffer.setOfferName("offer1");
		prodOffer.setOfferExpiryDate(LocalDate.of(2018, 07, 30));
		offers.add(prodOffer);
		
		// expired offer
		prodOffer.setOfferId(123);
		prodOffer.setOfferName("offer1");
		prodOffer.setOfferExpiryDate(LocalDate.of(2018, 06, 30));
		offers.add(prodOffer);
		
		return offers;
	}

}
