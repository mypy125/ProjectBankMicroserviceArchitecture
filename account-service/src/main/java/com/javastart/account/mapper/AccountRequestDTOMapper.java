package com.javastart.account.mapper;

import com.javastart.account.dto.AccountRequestDTO;
import com.javastart.account.entity.Account;

public class AccountRequestDTOMapper implements Mapper<Account, AccountRequestDTO>{

    @Override
    public AccountRequestDTO toDto(Account object) {
        return new AccountRequestDTO(
                object.getName(),
                object.getEmail(),
                object.getPhone(),
                object.getBills(),
                object.getCreationDate()
        );
    }

    @Override
    public Account toEntity(AccountRequestDTO dto) {
        return Account.builder()
                .name(dto.name())
                .email(dto.email())
                .phone(dto.phone())
                .build();
    }
}
