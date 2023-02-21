package com.andriosi.fabio.udemy.erudio.exceptions;

public class UnsupportedDivisionByZeroException extends  RuntimeException {
    private static final long serialVersionUID = 1L;

    public UnsupportedDivisionByZeroException(String message) {
        super(message);
    }
}
