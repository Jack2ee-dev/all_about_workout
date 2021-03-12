package com.jack2ee.server.dto.account.response;

import org.springframework.http.ResponseEntity;

import lombok.Builder;

@Builder
public class LoginResponseAccountDto {

    private final String token;

    private final String email;

    private final String firstName;

    private final String secondName;

    private final boolean oauth;

    private final String oauthProvider;

    private final boolean authorized;

    public LoginResponseAccountDto(String token, String email, String firstName,
        String secondName, boolean oauth, String oauthProvider, boolean authorized) {
        this.token = token;
        this.email = email;
        this.firstName = firstName;
        this.secondName = secondName;
        this.oauth = oauth;
        this.oauthProvider = oauthProvider;
        this.authorized = authorized;
    }
}
