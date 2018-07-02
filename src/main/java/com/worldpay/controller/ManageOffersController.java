package com.worldpay.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.worldpay.dto.Offer;
import com.worldpay.dto.OfferRequest;
import com.worldpay.dto.OfferResponse;
import com.worldpay.service.ManageOffersService;

@RestController
@RequestMapping(path = "/offers")
public class ManageOffersController {
    private static final String CRLF_REGEX = "[\r\n]";
    private static final Logger LOGGER = LoggerFactory.getLogger(ManageOffersController.class);

    @Autowired
    private ManageOffersService manageOffersService;

    @Autowired
    private ManageOffersController(ManageOffersService manageOffersService) {
        this.manageOffersService = manageOffersService;
    }
    
    @PostMapping(path = "/offers", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OfferResponse> updateCreditLimit(@RequestBody OfferRequest offerRequest) {
        OfferResponse response = manageOffersService.createOffer(offerRequest);
        return new ResponseEntity<OfferResponse>(response, HttpStatus.OK);
    }
    
    @GetMapping(path = "/offers", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Offer>> getOffers() {
    	List<Offer> response = manageOffersService.getOffers();
        return new ResponseEntity<List<Offer>>(response, HttpStatus.OK);
    }

    @PutMapping(path = "/offers/{ID}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OfferResponse> deleteOffer(@PathVariable String ID) {
        LOGGER.info("Delete an Offer {}", ID.replaceAll(CRLF_REGEX, ""));
        OfferResponse response = manageOffersService.deleteOffer(ID);
        return new ResponseEntity<OfferResponse>(response, HttpStatus.OK);
    }

}
