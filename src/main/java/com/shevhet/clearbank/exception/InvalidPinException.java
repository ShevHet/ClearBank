package com.shevhet.clearbank.exception;

public class InvalidPinException extends RuntimeException {
    public InvalidPinException(String message) {
        super("Invalid pin");
    }
}
