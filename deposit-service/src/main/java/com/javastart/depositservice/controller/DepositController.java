package com.javastart.depositservice.controller;

import com.javastart.depositservice.dto.DepositRequestDTO;
import com.javastart.depositservice.dto.DepositResponseDTO;
import com.javastart.depositservice.service.DepositService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DepositController {

    private final DepositService depositService;

    @PostMapping("/deposits")
    public DepositResponseDTO deposit(@RequestBody DepositRequestDTO requestDTO) {
        return depositService.deposit(requestDTO.accountId(), requestDTO.billId(), requestDTO.amount());
    }
}
