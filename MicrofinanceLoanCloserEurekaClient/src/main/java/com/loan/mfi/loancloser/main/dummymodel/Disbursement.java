package com.loan.mfi.loancloser.main.dummymodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disbursement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int disbursementId;
	
	private int customerId;
	private String dateOfDusbursement;
	private double disbursementAmt;
	
/*
{
	"disbursementId":1,
	"customerId":,
	"dateOfDusbursement":"4-5-2020",
	"disbursementAmt":60000.00
}
 */
	
	
	
	
	public int getDisbursementId() {
		return disbursementId;
	}
	public void setDisbursementId(int disbursementId) {
		this.disbursementId = disbursementId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getDateOfDusbursement() {
		return dateOfDusbursement;
	}
	public void setDateOfDusbursement(String dateOfDusbursement) {
		this.dateOfDusbursement = dateOfDusbursement;
	}
	public double getDisbursementAmt() {
		return disbursementAmt;
	}
	public void setDisbursementAmt(double disbursementAmt) {
		this.disbursementAmt = disbursementAmt;
	}
	@Override
	public String toString() {
		return "Disbursement [disbursementId=" + disbursementId + ", customerId=" + customerId + ", dateOfDusbursement="
				+ dateOfDusbursement + ", disbursementAmt=" + disbursementAmt + "]";
	}
	
	
	
}
