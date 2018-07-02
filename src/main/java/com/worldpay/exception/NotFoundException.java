package com.worldpay.exception;

public class NotFoundException extends CustomGenericException {

	private static final long serialVersionUID = 1L;

	public NotFoundException(String businessCode, Exception e) {
        super(businessCode, e);
    }

    public NotFoundException(String businessCode, String message) {
        super(businessCode, message);
    }



}
