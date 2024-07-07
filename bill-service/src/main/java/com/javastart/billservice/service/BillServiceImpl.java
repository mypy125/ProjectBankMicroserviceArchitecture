package com.javastart.billservice.service;

import com.javastart.billservice.dto.BillRequestDTO;
import com.javastart.billservice.entity.Bill;
import com.javastart.billservice.exception.BillNotFoundException;
import com.javastart.billservice.repository.BillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BillServiceImpl implements BillService{

    private final BillRepository billRepository;

    @Override
    public Bill getBillById(Long billId) {
        return billRepository.findById(billId)
                .orElseThrow(() -> new BillNotFoundException("Unable to find bill with id: " + billId));
    }

    @Override
    public Long createBill(BillRequestDTO dto) {
       Bill createBill = new Bill();
       createBill.setBillId(dto.accountId());
       createBill.setAccountId(dto.accountId());
       createBill.setAmount(dto.amount());
       createBill.setIsDefault(dto.isDefault());
       createBill.setCreationDate(dto.creationDate());
       createBill.setOverdraftEnabled(dto.overdraftEnabled());
        return billRepository.save(createBill).getBillId();
    }

    @Override
    public Bill updateBill(Long billId, BillRequestDTO dto) {
        Bill updateBill = getBillById(billId);
        updateBill.setBillId(dto.accountId());
        updateBill.setAccountId(dto.accountId());
        updateBill.setAmount(dto.amount());
        updateBill.setIsDefault(dto.isDefault());
        updateBill.setCreationDate(dto.creationDate());
        updateBill.setOverdraftEnabled(dto.overdraftEnabled());
        return billRepository.save(updateBill);
    }

    @Override
    public Bill deleteBill(Long billId) {
        Bill deletedBill = getBillById(billId);
        billRepository.deleteById(billId);
        return deletedBill;
    }

}
