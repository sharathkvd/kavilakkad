package com.pension.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetailsOfPensioner {
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public double getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(double salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	public int getAllowances() {
		return allowances;
	}
	public void setAllowances(int allowances) {
		this.allowances = allowances;
	}
	public String getTypeofPension() {
		return typeofPension;
	}
	public void setTypeofPension(String typeofPension) {
		this.typeofPension = typeofPension;
	}
	public BankDetail getBankDetail() {
		return bankDetail;
	}
	public void setBankDetail(BankDetail bankDetail) {
		this.bankDetail = bankDetail;
	}
	private String name;
	private Date dob;
	private long aadhaar;
	private String PAN;
	private double salaryEarned;
	private int allowances;
	private String typeofPension;
	private BankDetail bankDetail;
}
