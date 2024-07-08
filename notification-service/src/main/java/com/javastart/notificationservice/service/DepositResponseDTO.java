package com.javastart.notificationservice.service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
public class DepositResponseDTO {
    private BigDecimal amount;
    private String mail;
}
