package com.techhub.dto;

import java.math.BigInteger;

public class SalaryGenerationDTO {
	private BigInteger basicSalaryOfLowestGrade;
	private BigInteger companyAccountBalance;
	private int employeeId;
	
	
	public SalaryGenerationDTO() {
	}


	public SalaryGenerationDTO(BigInteger basicSalaryOfLowestGrade, BigInteger companyAccountBalance, int employeeId) {
		super();
		this.basicSalaryOfLowestGrade = basicSalaryOfLowestGrade;
		this.companyAccountBalance = companyAccountBalance;
		this.employeeId = employeeId;
	}


	public BigInteger getBasicSalaryOfLowestGrade() {
		return basicSalaryOfLowestGrade;
	}


	public void setBasicSalaryOfLowestGrade(BigInteger basicSalaryOfLowestGrade) {
		this.basicSalaryOfLowestGrade = basicSalaryOfLowestGrade;
	}


	public BigInteger getCompanyAccountBalance() {
		return companyAccountBalance;
	}


	public void setCompanyAccountBalance(BigInteger companyAccountBalance) {
		this.companyAccountBalance = companyAccountBalance;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((basicSalaryOfLowestGrade == null) ? 0 : basicSalaryOfLowestGrade.hashCode());
		result = prime * result + ((companyAccountBalance == null) ? 0 : companyAccountBalance.hashCode());
		result = prime * result + employeeId;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalaryGenerationDTO other = (SalaryGenerationDTO) obj;
		if (basicSalaryOfLowestGrade == null) {
			if (other.basicSalaryOfLowestGrade != null)
				return false;
		} else if (!basicSalaryOfLowestGrade.equals(other.basicSalaryOfLowestGrade))
			return false;
		if (companyAccountBalance == null) {
			if (other.companyAccountBalance != null)
				return false;
		} else if (!companyAccountBalance.equals(other.companyAccountBalance))
			return false;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "SalaryGenerationDTO [basicSalaryOfLowestGrade=" + basicSalaryOfLowestGrade + ", companyAccountBalance="
				+ companyAccountBalance + ", employeeId=" + employeeId + "]";
	}


}
