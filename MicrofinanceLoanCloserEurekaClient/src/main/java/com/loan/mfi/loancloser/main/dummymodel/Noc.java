package com.loan.mfi.loancloser.main.dummymodel;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Noc {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int nocId;
	
	private int customerId;			//FK
	private String customerName;
	private int loanId;				//FK
	private int ledgerId;			//FK
	private int disbursementId;		//FK
	private int loanType;			//FK
	private double loanAmount;
	private int tenure;
	private double rateOfInterest;
	private double totalAmountPaid;
	private String loanStartingDate;
	private String loanCloserDate;
	private int loanStatus;
	private String remarks;
	
/*
 
{
	"customerId":1,
	"customerName":"abcd name",
	"loanId":1,
	"ledgerId":1,
	"disbursementId":1,
	"loanType":1,
	"loanAmount":51000.00,
	"tenure":11,
	"rateOfInterest":12.5,
	"totalAmountPaid":65000,
	"loanStartingDate":"23-4-2019",
	"loanCloserDate":"24-3-2019",
	"loanStatus":1,
	"remarks":"No Objection"
}

*/
	
	
	public int getNocId() {
		return nocId;
	}
	public void setNocId(int nocId) {
		this.nocId = nocId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	public int getDisbursementId() {
		return disbursementId;
	}
	public void setDisbursementId(int disbursementId) {
		this.disbursementId = disbursementId;
	}
	public int getLoanType() {
		return loanType;
	}
	public void setLoanType(int loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public double getTotalAmountPaid() {
		return totalAmountPaid;
	}
	public void setTotalAmountPaid(double totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}
	public String getLoanStartingDate() {
		return loanStartingDate;
	}
	public void setLoanStartingDate(String loanStartingDate) {
		this.loanStartingDate = loanStartingDate;
	}
	public String getLoanCloserDate() {
		return loanCloserDate;
	}
	public void setLoanCloserDate(String loanCloserDate) {
		this.loanCloserDate = loanCloserDate;
	}
	public int getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(int loanStatus) {
		this.loanStatus = loanStatus;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "Noc [nocId=" + nocId + ", customerId=" + customerId + ", customerName=" + customerName + ", loanId="
				+ loanId + ", ledgerId=" + ledgerId + ", disbursementId=" + disbursementId + ", loanType=" + loanType
				+ ", loanAmount=" + loanAmount + ", tenure=" + tenure + ", rateOfInterest=" + rateOfInterest
				+ ", totalAmountPaid=" + totalAmountPaid + ", loanStartingDate=" + loanStartingDate
				+ ", loanClosureDate=" + loanCloserDate + ", loanStatus=" + loanStatus + ", remarks=" + remarks + "]";
	}
	

}





