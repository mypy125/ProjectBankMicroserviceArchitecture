package com.javastart.account.mapper;

import com.javastart.account.dto.AccountResponseDTO;
import com.javastart.account.entity.Account;

public class AccountResponseDTOMapper implements Mapper<Account, AccountResponseDTO> {
    @Override
    public AccountResponseDTO toDto(Account object) {
        return new AccountResponseDTO(
                object.getAccountId(),
                object.getName(),
                object.getEmail(),
                object.getBills(),
                object.getPhone(),
                object.getCreationDate()
        );
    }

    @Override
    public Account toEntity(AccountResponseDTO dto) {
        return Account.builder()
                .accountId(dto.accountId())
                .name(dto.name())
                .email(dto.email())
                .phone(dto.phone())
                .bills(dto.bills())
                .build();
    }
}
