package com.worldpay.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.worldpay.dto.ErrorResponse;
import com.worldpay.exception.CustomGenericException;
import com.worldpay.exception.InternalServerErrorException;
import com.worldpay.exception.NotFoundException;
import com.worldpay.exception.UnauthorizedException;

@ControllerAdvice
public class ManageOffersExceptionHandler {

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ErrorResponse> handleUnauthorizedException(UnauthorizedException exception) {
        ErrorResponse response = new ErrorResponse(HttpStatus.UNAUTHORIZED.toString(), HttpStatus.UNAUTHORIZED.getReasonPhrase());
        return new ResponseEntity<ErrorResponse>(response, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException exception) {
        ErrorResponse response = new ErrorResponse(HttpStatus.NOT_FOUND.toString(), HttpStatus.NOT_FOUND.getReasonPhrase());
        return new ResponseEntity<ErrorResponse>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<ErrorResponse> handleInternalServerErrorException(InternalServerErrorException exception) {
        ErrorResponse response = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        return new ResponseEntity<ErrorResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CustomGenericException.class)
    public ResponseEntity<ErrorResponse> handleCustomGenericException(CustomGenericException exception) {
        ErrorResponse response = new ErrorResponse(exception.getHttpCode().toString(), exception.getHttpCode().getReasonPhrase());
        return new ResponseEntity<ErrorResponse>(response, exception.getHttpCode());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception exception) {
        ErrorResponse response = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        return new ResponseEntity<ErrorResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
