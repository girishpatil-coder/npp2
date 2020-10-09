package com.loan.mfi.loancloser.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.mfi.loancloser.main.dummymodel.Ledger;

@Repository
public interface Ledgerrepo extends JpaRepository<Ledger, Integer>{

}
