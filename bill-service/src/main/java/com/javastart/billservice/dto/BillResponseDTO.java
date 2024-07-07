package com.javastart.billservice.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public record BillResponseDTO (
        Long billId,
        Long accountId,
        BigDecimal amount,
        Boolean isDefault,
        OffsetDateTime creationDate,
        Boolean overdraftEnabled) {

}
