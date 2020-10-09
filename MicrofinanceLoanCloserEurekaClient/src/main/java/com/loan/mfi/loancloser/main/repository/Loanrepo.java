package com.loan.mfi.loancloser.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.mfi.loancloser.main.dummymodel.Loan;

@Repository
public interface Loanrepo extends JpaRepository<Loan, Integer>{

}
