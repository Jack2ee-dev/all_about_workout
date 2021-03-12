package com.jack2ee.server.service.account;

import com.jack2ee.server.domain.account.Account;
import com.jack2ee.server.dto.account.request.LoginRequestAccountDto;
import com.jack2ee.server.dto.account.request.SignupRequestAccountDto;
import com.jack2ee.server.repository.account.AccountRepository;

import org.springframework.stereotype.Service;

import java.util.Optional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Optional<Account> findByEmail(
        SignupRequestAccountDto dto) {
        return this.accountRepository.findAccountByEmail(dto.getEmail());
    }

    @Override
    public Optional<Account> findByEmail(LoginRequestAccountDto dto) {
        return this.accountRepository.findAccountByEmail(dto.getEmail());
    }
}
