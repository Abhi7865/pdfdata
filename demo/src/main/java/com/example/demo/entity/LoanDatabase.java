package com.example.demo.entity;

import java.io.ByteArrayInputStream;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "LoanDatabase")
public class LoanDatabase {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	private String LoanNumber;
	private String firstName;
	private String lastName;
	private String dob;
	private float loanAmount;
	private int loanTennure;
	private float LoanEmi;

    @Lob
    private byte[] Loanpdf;

    
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public byte[] getLoanpdf() {
		return Loanpdf;
	}

	public void setLoanpdf(byte[] pdf) {
		Loanpdf = pdf;
	}
    
    
}
