package com.jack2ee.server.exception;

public class CustomException extends RuntimeException {

    public CustomException(String message) {
        super("[ERROR] " + message);
    }
}
