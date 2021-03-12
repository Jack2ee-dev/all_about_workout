package com.jack2ee.server.exception.auth;

import com.jack2ee.server.exception.CustomException;

public class AlreadySignupException extends CustomException {

    private static final String ALREADY_SIGNUP_EXCEPTION = "은 이미 등록된 이메일입니다.";

    public AlreadySignupException(String email) {
        super(email + ALREADY_SIGNUP_EXCEPTION);
    }
}
