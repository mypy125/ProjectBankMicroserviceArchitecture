package com.javastart.billservice.mapper;

import com.javastart.billservice.dto.BillRequestDTO;
import com.javastart.billservice.entity.Bill;

public class BillRequestDTOMapper implements Mapper<Bill, BillRequestDTO> {
    @Override
    public BillRequestDTO toDto(Bill entity) {
        return new BillRequestDTO(
                entity.getBillId(),
                entity.getAmount(),
                entity.getIsDefault(),
                entity.getCreationDate(),
                entity.getOverdraftEnabled()
        );
    }

    @Override
    public Bill toEntity(BillRequestDTO dto) {
        return Bill.builder()
                .accountId(dto.accountId())
                .amount(dto.amount())
                .isDefault(dto.isDefault())
                .creationDate(dto.creationDate())
                .overdraftEnabled(dto.overdraftEnabled())
                .build();
    }
}
