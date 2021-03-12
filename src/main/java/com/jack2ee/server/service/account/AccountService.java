package com.jack2ee.server.service.account;

import com.jack2ee.server.domain.account.Account;
import com.jack2ee.server.dto.account.request.LoginRequestAccountDto;
import com.jack2ee.server.dto.account.request.SignupRequestAccountDto;

import java.util.Optional;

public interface AccountService {

    Optional<Account> findByEmail(
        SignupRequestAccountDto dto);

    Optional<Account> findByEmail(
        LoginRequestAccountDto dto);
}
