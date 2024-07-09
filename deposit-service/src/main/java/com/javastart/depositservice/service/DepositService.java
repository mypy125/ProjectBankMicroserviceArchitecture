package com.javastart.depositservice.service;

import com.javastart.depositservice.dto.DepositResponseDTO;

import java.math.BigDecimal;

public interface DepositService {
     DepositResponseDTO deposit(Long accountId, Long billId, BigDecimal amount);
}
