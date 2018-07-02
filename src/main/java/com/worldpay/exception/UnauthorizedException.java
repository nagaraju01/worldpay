package com.worldpay.exception;

public class UnauthorizedException extends CustomGenericException {

	private static final long serialVersionUID = 1L;

	public UnauthorizedException(String businessCode, Exception e) {
        super(businessCode, e);
    }

    public UnauthorizedException(String businessCode, String message) {
        super(businessCode, message);
    }

    public UnauthorizedException(String businessCode, String message, Exception e) {
        super(businessCode, message);
    }

}
