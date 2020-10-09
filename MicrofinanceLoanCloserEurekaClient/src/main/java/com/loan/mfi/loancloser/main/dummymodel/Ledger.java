package com.loan.mfi.loancloser.main.dummymodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ledger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerId;
	
	private double totalLoanAmt;
	private double installmentAmt;
	private double totalPaidAmt;
	private double installmentNo;
	private String dateOfPayment;
	
/*
{
	"ledgerId":5,
	"totalLoanAmt": 60000.00,
	"installmentAmt": 5000.00,
	"totalPaidAmt": 25000.00,
	"installmentNo": 5,
	"dateOfPayment":"3-4-2020"	
}
	
*/
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	public double getTotalLoanAmt() {
		return totalLoanAmt;
	}
	public void setTotalLoanAmt(double totalLoanAmt) {
		this.totalLoanAmt = totalLoanAmt;
	}
	public double getInstallmentAmt() {
		return installmentAmt;
	}
	public void setInstallmentAmt(double installmentAmt) {
		this.installmentAmt = installmentAmt;
	}
	public double getTotalPaidAmt() {
		return totalPaidAmt;
	}
	public void setTotalPaidAmt(double totalPaidAmt) {
		this.totalPaidAmt = totalPaidAmt;
	}
	public double getInstallmentNo() {
		return installmentNo;
	}
	public void setInstallmentNo(double installmentNo) {
		this.installmentNo = installmentNo;
	}
	public String getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(String dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	@Override
	public String toString() {
		return "Ledger [ledgerId=" + ledgerId + ", totalLoanAmt=" + totalLoanAmt + ", installmentAmt=" + installmentAmt
				+ ", totalPaidAmt=" + totalPaidAmt + ", installmentNo=" + installmentNo + ", dateOfPayment="
				+ dateOfPayment + "]";
	}
	
	
	
	
	
	
}
