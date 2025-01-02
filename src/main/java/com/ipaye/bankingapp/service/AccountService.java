package com.ipaye.bankingapp.service;

import com.ipaye.bankingapp.dto.AccountDto;
import com.ipaye.bankingapp.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);
}
