package com.jack2ee.server.dto.account.request;

import lombok.Getter;

@Getter
public class LoginRequestAccountDto {

    private final String email;

    private final String password;

    public LoginRequestAccountDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
