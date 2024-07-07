package com.javastart.billservice.mapper;

import com.javastart.billservice.dto.BillResponseDTO;
import com.javastart.billservice.entity.Bill;

public class BillResponseDTOMapper implements Mapper<Bill, BillResponseDTO> {
    @Override
    public BillResponseDTO toDto(Bill entity) {
        return new BillResponseDTO(
                entity.getBillId(),
                entity.getAccountId(),
                entity.getAmount(),
                entity.getIsDefault(),
                entity.getCreationDate(),
                entity.getOverdraftEnabled()
        );
    }

    @Override
    public Bill toEntity(BillResponseDTO dto) {
        return null;
    }
}
