package com.javastart.billservice.service;

import com.javastart.billservice.dto.BillRequestDTO;
import com.javastart.billservice.entity.Bill;

public interface BillService {
    Bill getBillById(Long billId);
    Long createBill(BillRequestDTO dto);
    Bill updateBill(Long billId, BillRequestDTO dto);
    Bill deleteBill(Long billId);
}
