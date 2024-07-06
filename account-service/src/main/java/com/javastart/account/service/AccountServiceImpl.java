package com.javastart.account.service;

import com.javastart.account.dto.AccountRequestDTO;
import com.javastart.account.dto.AccountResponseDTO;
import com.javastart.account.entity.Account;
import com.javastart.account.exception.AccountNotFoundException;
import com.javastart.account.mapper.AccountRequestDTOMapper;
import com.javastart.account.mapper.AccountResponseDTOMapper;
import com.javastart.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{

    private final AccountRepository accountRepository;

    @Override
    public Account getAccountById(Long accountId) {
        return accountRepository.findById(accountId)
                .orElseThrow(() -> new AccountNotFoundException("Unable to find account with id: " + accountId));
    }

    @Override
    public Long createAccount(AccountRequestDTO dto) {
        return accountRepository.save(new AccountRequestDTOMapper().toEntity(dto)).getAccountId();
    }

    @Override
    public Account updateAccount(Long accountId, AccountRequestDTO dto) {
        Account updateAccount = getAccountById(accountId);
        updateAccount.setName(dto.name());
        updateAccount.setEmail(dto.email());
        updateAccount.setPhone(dto.phone());
        updateAccount.setBills(dto.bills());
        return accountRepository.save(updateAccount);
    }

    @Override
    public Account deleteAccount(Long accountId) {
        Account deletedAccount = getAccountById(accountId);
        accountRepository.deleteById(accountId);
        return deletedAccount;
    }


}
