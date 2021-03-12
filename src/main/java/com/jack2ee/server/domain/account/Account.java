package com.jack2ee.server.domain.account;

import com.jack2ee.server.dto.account.request.SignupRequestAccountDto;
import com.jack2ee.server.util.account.AccountUtil;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Entity
@Getter
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String secondName;

    @Column
    private boolean oauth;

    @Column
    private String oauthProvider;

    @Column
    private boolean authorized;

    public Account(SignupRequestAccountDto dto) {
        this.token = AccountUtil.generateToken(dto);
        this.email = dto.getEmail();
        this.password = new BCryptPasswordEncoder().encode(dto.getPassword());
        this.firstName = dto.getFirstName();
        this.secondName = dto.getSecondName();
        this.oauth = dto.isOauth();
        this.oauthProvider = dto.getOauthProvider();
        this.authorized = dto.isAuthorized();
    }

    public Account() {

    }
}
