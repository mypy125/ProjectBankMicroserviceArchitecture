package com.javastart.depositservice.dto;

import java.math.BigDecimal;

public record DepositRequestDTO(
        Long accountId,
        Long billId,
        BigDecimal amount) {

}
