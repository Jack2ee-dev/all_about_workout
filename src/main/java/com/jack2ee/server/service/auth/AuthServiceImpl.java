package com.jack2ee.server.service.auth;

import com.jack2ee.server.domain.account.Account;
import com.jack2ee.server.dto.account.request.LoginRequestAccountDto;
import com.jack2ee.server.dto.account.request.SignupRequestAccountDto;
import com.jack2ee.server.dto.account.response.LoginResponseAccountDto;
import com.jack2ee.server.exception.auth.AlreadySignupException;
import com.jack2ee.server.exception.auth.NotSignupException;
import com.jack2ee.server.repository.account.AccountRepository;
import com.jack2ee.server.service.account.AccountService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AuthServiceImpl implements AuthService {
    /*

     */

    private final AccountRepository accountRepository;
    private final AccountService accountService;

    @Override
    public void signup(@RequestBody SignupRequestAccountDto dto) {
        Optional<Account> existingAccount = accountService.findByEmail(dto);
        if (existingAccount.isPresent()) {
            throw new AlreadySignupException(dto.getEmail());
        }
        Account newAccount = new Account(dto);
        accountRepository.save(newAccount);
    }

    @Override
    public ResponseEntity<LoginResponseAccountDto> login(@RequestBody LoginRequestAccountDto dto) {
        Optional<Account> existingAccount = accountService.findByEmail(dto);
        if (!existingAccount.isPresent()) {
            throw new NotSignupException(dto.getEmail());
        }
        Account account = existingAccount.get();
        LoginResponseAccountDto responseAccountDto = LoginResponseAccountDto
            .builder()
            .email(account.getEmail())
            .firstName(account.getFirstName())
            .secondName(account.getSecondName())
            .authorized(account.isAuthorized())
            .oauth(account.isOauth())
            .oauthProvider(account.getOauthProvider())
            .token(account.getToken())
            .build();
        return new ResponseEntity<>(responseAccountDto, new HttpHeaders(), HttpStatus.OK);
    }
}
