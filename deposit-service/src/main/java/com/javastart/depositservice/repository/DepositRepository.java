package com.javastart.depositservice.repository;

import com.javastart.depositservice.entity.Deposit;
import org.springframework.data.repository.CrudRepository;

public interface DepositRepository extends CrudRepository<Deposit, Long> {
}
