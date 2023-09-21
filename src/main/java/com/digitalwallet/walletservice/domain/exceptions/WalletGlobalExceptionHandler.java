package com.digitalwallet.walletservice.domain.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class WalletGlobalExceptionHandler {

    @ExceptionHandler(WalletGenericClientException.class)
    public ResponseEntity<WalletError> handleClientGenericError(WalletGenericClientException ex){
        HttpStatus status = ex.getHttpStatus();
        String message = ex.getMessage();
        String code = ex.getCode();
        WalletError walletError = new WalletError(status, message, code);
        return new ResponseEntity<>(walletError, walletError.getStatus());
    }
}