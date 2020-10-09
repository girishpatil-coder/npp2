package com.loan.mfi.loancloser.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.mfi.loancloser.main.dummymodel.Disbursement;

@Repository
public interface Disbursementrepo extends JpaRepository<Disbursement, Integer>{

}
