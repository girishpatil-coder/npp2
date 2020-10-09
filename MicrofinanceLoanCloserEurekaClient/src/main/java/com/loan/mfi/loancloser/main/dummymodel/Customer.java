package com.loan.mfi.loancloser.main.dummymodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	private	String customerName;
	private	String customerMobileNo;
	private	String customerEmailId;
	private	String customerGender;
	private	String customerDob;
	private	int customerAge;
	
	
/*
 
{
	"customerName":"Naveen ",
	"customerMobileNo":"8912345678",
	"customerEmailId":"asdfawf@gmail.com",
	"customerGender":"Male",
	"customerDob":"9-8-1990",
	"customerAge":"30"

},
{
	"customerName":"Namita  ",
	"customerMobileNo":"8912345678",
	"customerEmailId":"Namita@gmail.com",
	"customerGender":"Female",
	"customerDob":"9-8-1990",
	"customerAge":"30"
	
}
 

*/
	
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
	public String getCustomerMobileNo() {
		return customerMobileNo;
	}
	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerMobileNo="
				+ customerMobileNo + ", customerEmailId=" + customerEmailId + ", customerGender=" + customerGender
				+ ", customerDob=" + customerDob + ", customerAge=" + customerAge + "]";
	}


	
	
}	
