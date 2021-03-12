package com.jack2ee.server.service.auth;

import com.jack2ee.server.dto.account.request.LoginRequestAccountDto;
import com.jack2ee.server.dto.account.request.SignupRequestAccountDto;
import com.jack2ee.server.dto.account.response.LoginResponseAccountDto;

import org.springframework.http.ResponseEntity;

public interface AuthService {

    void signup(SignupRequestAccountDto dto);

    ResponseEntity<LoginResponseAccountDto> login(LoginRequestAccountDto dto);

}
