package com.techhub.dto;


public class EmployeeSalarySheetDTO {

	
	private int id;
	private String employeename;
	private String gradename;
	private Double balance;
	
	
	public EmployeeSalarySheetDTO() {
		
	}


	public EmployeeSalarySheetDTO(int id, String employeename, String gradename, Double balance) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.gradename = gradename;
		this.balance = balance;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmployeename() {
		return employeename;
	}


	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}


	public String getGradename() {
		return gradename;
	}


	public void setGradename(String gradename) {
		this.gradename = gradename;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((employeename == null) ? 0 : employeename.hashCode());
		result = prime * result + ((gradename == null) ? 0 : gradename.hashCode());
		result = prime * result + id;
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
		EmployeeSalarySheetDTO other = (EmployeeSalarySheetDTO) obj;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (employeename == null) {
			if (other.employeename != null)
				return false;
		} else if (!employeename.equals(other.employeename))
			return false;
		if (gradename == null) {
			if (other.gradename != null)
				return false;
		} else if (!gradename.equals(other.gradename))
			return false;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "EmployeeSalarySheetDTO [id=" + id + ", employeename=" + employeename + ", gradename=" + gradename
				+ ", balance=" + balance + "]";
	}


	
}
