package com.loan.mfi.loancloser.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.mfi.loancloser.main.model.NormalCloser;

@Repository
public interface NormalCloserrepo extends JpaRepository<NormalCloser, Integer>{

}
