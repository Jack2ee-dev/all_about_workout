package com.jack2ee.server.util.account;

import com.jack2ee.server.dto.account.request.SignupRequestAccountDto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class AccountUtil {

    public static String generateToken(SignupRequestAccountDto dto) {
        return "jwtGenerated";
    }
}
