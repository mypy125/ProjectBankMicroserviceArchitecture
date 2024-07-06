package com.javastart.billservice.repository;

import com.javastart.billservice.entity.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill, Long> {
}
