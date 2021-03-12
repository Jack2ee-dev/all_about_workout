package com.jack2ee.server.controller.auth;

import com.jack2ee.server.dto.account.request.LoginRequestAccountDto;
import com.jack2ee.server.dto.account.request.SignupRequestAccountDto;
import com.jack2ee.server.service.auth.AuthService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/auth")
public class AuthController {

    private final AuthService auth;

    @PostMapping(path = "/signup/email")
    public void signup(@RequestBody SignupRequestAccountDto dto) {
        auth.signup(dto);
    }

    @PostMapping(path = "/login/email")
    public void login(@RequestBody LoginRequestAccountDto dto) {
        auth.login(dto);
    }
}
