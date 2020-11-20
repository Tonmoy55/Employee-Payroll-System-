package com.techhub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	private String employeename;
	
	@OneToOne
	@JoinColumn(name= "gradeid")
	private Grade grade;
	
	private String address;
	private String mobileno;
	
	@OneToOne
	@JoinColumn(name= "accountid")
	private BankAccount bankAccount;

	public Employee() {
		
	}

	public Employee(String employeename, Grade grade, String address, String mobileno, BankAccount bankAccount) {
		super();
		this.employeename = employeename;
		this.grade = grade;
		this.address = address;
		this.mobileno = mobileno;
		this.bankAccount = bankAccount;
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

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeename=" + employeename + ", grade=" + grade + ", address=" + address
				+ ", mobileno=" + mobileno + ", bankAccount=" + bankAccount + "]";
	}
	
	

	

}
