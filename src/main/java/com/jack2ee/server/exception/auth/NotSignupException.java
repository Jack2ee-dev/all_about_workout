package com.jack2ee.server.exception.auth;

import com.jack2ee.server.exception.CustomException;

public class NotSignupException extends CustomException {

    private static final String NOT_SIGNUP_EXCEPTION = "은 가입되지 않았습니다.";

    public NotSignupException(String email) {
        super(email + NOT_SIGNUP_EXCEPTION);
    }
}
