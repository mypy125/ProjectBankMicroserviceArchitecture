package com.javastart.billservice.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public record BillRequestDTO(
        Long accountId,
        BigDecimal amount,
        Boolean isDefault,
        OffsetDateTime creationDate,
        Boolean overdraftEnabled) {

}
