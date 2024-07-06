package com.javastart.account.dto;

import java.time.OffsetDateTime;
import java.util.List;

public record AccountResponseDTO(
        Long accountId,
        String name,
        String email,
        List<Long> bills,
        String phone,
        OffsetDateTime creationDate) {

}
