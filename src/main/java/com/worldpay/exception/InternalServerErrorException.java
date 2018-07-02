package com.worldpay.exception;

public class InternalServerErrorException extends CustomGenericException{

	private static final long serialVersionUID = 1L;

	public InternalServerErrorException(String businessCode, Exception e) {
        super(businessCode, e);
    }

    public InternalServerErrorException(String businessCode, String message) {
        super(businessCode, message);
    }

}
