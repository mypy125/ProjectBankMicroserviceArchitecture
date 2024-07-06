package com.javastart.account.dto;

import java.time.OffsetDateTime;
import java.util.List;

public record AccountRequestDTO (
        String name,
        String email,
        String phone,
        List<Long> bills,
        OffsetDateTime creationDate){

}
