package com.example.demo.payload;

public class RequestPayload {
	private String LoanNumber;
	private String firstName;
	private String lastName;
	private String dob;
	private float loanAmount;
	private int loanTennure;
	private float LoanEmi;
	
	public String getLoanNumber() {
		return LoanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		LoanNumber = loanNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanTennure() {
		return loanTennure;
	}
	public void setLoanTennure(int loanTennure) {
		this.loanTennure = loanTennure;
	}
	public float getLoanEmi() {
		return LoanEmi;
	}
	public void setLoanEmi(float loanEmi) {
		LoanEmi = loanEmi;
	}
	
		
	

}
