package com.jack2ee.server.repository.account;

import com.jack2ee.server.domain.account.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query("FROM Account "
        + "WHERE email = :email")
    Optional<Account> findAccountByEmail(
        @Param("email") String email
    );

}
