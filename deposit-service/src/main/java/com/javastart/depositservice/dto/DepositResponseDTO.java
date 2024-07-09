package com.javastart.depositservice.dto;


import java.math.BigDecimal;

public record DepositResponseDTO (
        BigDecimal amount,
        String mail){

}
