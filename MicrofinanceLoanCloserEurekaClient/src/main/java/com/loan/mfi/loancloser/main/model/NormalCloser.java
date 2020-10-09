package com.loan.mfi.loancloser.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.loan.mfi.loancloser.main.dummymodel.Customer;
import com.loan.mfi.loancloser.main.dummymodel.Disbursement;
import com.loan.mfi.loancloser.main.dummymodel.Ledger;
import com.loan.mfi.loancloser.main.dummymodel.Loan;
import com.loan.mfi.loancloser.main.dummymodel.LoanType;
import com.loan.mfi.loancloser.main.dummymodel.Noc;


@Entity
public class NormalCloser {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int normalClosureId;

	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;             //customer
	
	@OneToOne(cascade = CascadeType.ALL)
	private Loan loan;                      //loan

	
	@OneToOne(cascade = CascadeType.ALL)
	private Ledger ledger;                  //leader
	
	@OneToOne(cascade = CascadeType.ALL)
	private Disbursement disbursement;     	//disbursment
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoanType loantype;              //loantype
	
	private String tenure;               
	private double rateOfInterest;
	private double installmentAmount;     
	private String lastInstallmentDate;
	private double totalAmountPaid;
	private double totalInterestPaid;
	private int totalInstallmentsPaid;
	private String normalClosureStatus;
	
	@OneToOne(cascade = CascadeType.ALL)  
	private Noc noc;                       //noc
	
 	private String dateOfClosure;

	public int getNormalClosureId() {
		return normalClosureId;
	}

	public void setNormalClosureId(int normalClosureId) {
		this.normalClosureId = normalClosureId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public Ledger getLedger() {
		return ledger;
	}

	public void setLedger(Ledger ledger) {
		this.ledger = ledger;
	}

	public Disbursement getDisbursement() {
		return disbursement;
	}

	public void setDisbursement(Disbursement disbursement) {
		this.disbursement = disbursement;
	}

	public LoanType getLoantype() {
		return loantype;
	}

	public void setLoantype(LoanType loantype) {
		this.loantype = loantype;
	}

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public double getInstallmentAmount() {
		return installmentAmount;
	}

	public void setInstallmentAmount(double installmentAmount) {
		this.installmentAmount = installmentAmount;
	}

	public String getLastInstallmentDate() {
		return lastInstallmentDate;
	}

	public void setLastInstallmentDate(String lastInstallmentDate) {
		this.lastInstallmentDate = lastInstallmentDate;
	}

	public double getTotalAmountPaid() {
		return totalAmountPaid;
	}

	public void setTotalAmountPaid(double totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}

	public double getTotalInterestPaid() {
		return totalInterestPaid;
	}

	public void setTotalInterestPaid(double totalInterestPaid) {
		this.totalInterestPaid = totalInterestPaid;
	}

	public int getTotalInstallmentsPaid() {
		return totalInstallmentsPaid;
	}

	public void setTotalInstallmentsPaid(int totalInstallmentsPaid) {
		this.totalInstallmentsPaid = totalInstallmentsPaid;
	}

	public String getNormalClosureStatus() {
		return normalClosureStatus;
	}

	public void setNormalClosureStatus(String normalClosureStatus) {
		this.normalClosureStatus = normalClosureStatus;
	}

	public Noc getNoc() {
		return noc;
	}

	public void setNoc(Noc noc) {
		this.noc = noc;
	}

	public String getDateOfClosure() {
		return dateOfClosure;
	}

	public void setDateOfClosure(String dateOfClosure) {
		this.dateOfClosure = dateOfClosure;
	}

	@Override
	public String toString() {
		return "NormalCloser [normalClosureId=" + normalClosureId + ", customer=" + customer + ", loan=" + loan
				+ ", ledger=" + ledger + ", disbursement=" + disbursement + ", loantype=" + loantype + ", tenure="
				+ tenure + ", rateOfInterest=" + rateOfInterest + ", installmentAmount=" + installmentAmount
				+ ", lastInstallmentDate=" + lastInstallmentDate + ", totalAmountPaid=" + totalAmountPaid
				+ ", totalInterestPaid=" + totalInterestPaid + ", totalInstallmentsPaid=" + totalInstallmentsPaid
				+ ", normalClosureStatus=" + normalClosureStatus + ", noc=" + noc + ", dateOfClosure=" + dateOfClosure
				+ "]";
	}
 	
 	
    
}
