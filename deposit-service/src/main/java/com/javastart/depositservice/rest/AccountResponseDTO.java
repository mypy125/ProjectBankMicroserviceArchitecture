package com.javastart.depositservice.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponseDTO {
    private Long accountId;
    private String name;
    private String email;
    private List<Long> bills;
    private String phone;
    private OffsetDateTime creationDat;

}
