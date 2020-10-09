package com.loan.mfi.loancloser.main.dummymodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanTypeId;
	
	private String loanType;
	
/*
 {
 	"loanTypeId":1,
 	"loanType":"Individual"
 },
 
 {
 	"loanTypeId":2,
 	"loanType":"Group"
 }
 
 */
	
	
	public int getLoanTypeId() {
		return loanTypeId;
	}
	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	@Override
	public String toString() {
		return "LoanType [loanTypeId=" + loanTypeId + ", loanType=" + loanType + "]";
	}
	
	
	
}
