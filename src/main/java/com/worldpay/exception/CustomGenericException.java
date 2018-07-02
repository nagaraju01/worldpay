package com.worldpay.exception;

import org.springframework.http.HttpStatus;

public class CustomGenericException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String businessCode;
	
    public CustomGenericException(String businessCode, String message) {
        super(message);
        this.businessCode = businessCode;
    }

    public CustomGenericException(String businessCode, Exception e) {
        super(e.getMessage());
        this.businessCode = businessCode;
    }

    public String getBusinessCode() {
        return businessCode;
    }

}
