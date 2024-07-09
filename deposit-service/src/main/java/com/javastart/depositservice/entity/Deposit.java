package com.javastart.depositservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Data
@NoArgsConstructor
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long depositId;

    private BigDecimal amount;
    private Long billId;
    private OffsetDateTime creationDate;
    private String email;

    public Deposit(BigDecimal amount, Long billId, OffsetDateTime creationDate, String email) {
        this.amount = amount;
        this.billId = billId;
        this.creationDate = creationDate;
        this.email = email;
    }
}
