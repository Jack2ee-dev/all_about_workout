package com.jack2ee.server.dto.account.request;

import lombok.Getter;

@Getter
public class SignupRequestAccountDto {

    private final String email;

    private final String password;

    private final String firstName;

    private final String secondName;

    private final boolean oauth;

    private final String oauthProvider;

    private final boolean authorized;

    public SignupRequestAccountDto(String email, String password, String firstName,
        String secondName, boolean oauth, String oauthProvider, boolean authorized) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.oauth = oauth;
        this.oauthProvider = oauthProvider;
        this.authorized = authorized;
    }
}
