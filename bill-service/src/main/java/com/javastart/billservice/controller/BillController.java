package com.javastart.billservice.controller;

import com.javastart.billservice.dto.BillRequestDTO;
import com.javastart.billservice.dto.BillResponseDTO;
import com.javastart.billservice.mapper.BillResponseDTOMapper;
import com.javastart.billservice.service.BillServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BillController {

    private final BillServiceImpl billService;


    @GetMapping("/{billId}")
    public BillResponseDTO getBill(@PathVariable Long billId) {
        return new BillResponseDTOMapper().toDto(billService.getBillById(billId));
    }

    @PostMapping("/")
    public Long createBill(@RequestBody BillRequestDTO billRequestDTO) {
        return billService.createBill(billRequestDTO);
    }

    @PutMapping("/{billId}")
    public BillResponseDTO updateBill(@PathVariable Long billId,
                                      @RequestBody BillRequestDTO billRequestDTO) {
        return new BillResponseDTOMapper().toDto(billService.updateBill(billId, billRequestDTO));
    }

    @DeleteMapping("/{billId}")
    public BillResponseDTO deleteBill(@PathVariable Long billId) {
        return new BillResponseDTOMapper().toDto(billService.deleteBill(billId));
    }
}
