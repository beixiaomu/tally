package com.bei.tally.exception;


@SuppressWarnings("serial")
public class BusinessException extends RuntimeException {

    public BusinessException() {

    }

    public BusinessException(String message) {
        super(message);
    }
}
