package com.loan.mfi.loancloser.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.mfi.loancloser.main.dummymodel.Customer;

@Repository
public interface Customerrepo extends JpaRepository<Customer, Integer>{

}
