package com.javastart.account.service;

import com.javastart.account.dto.AccountRequestDTO;
import com.javastart.account.dto.AccountResponseDTO;
import com.javastart.account.entity.Account;

public interface AccountService {
    Account getAccountById(Long id);
    Long createAccount(AccountRequestDTO dto);
    Account updateAccount(Long accountId, AccountRequestDTO dto);
    Account deleteAccount(Long accountId);
}
