package com.techhub.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bankaccount")
public class BankAccount {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String accounttype;
	private String accountname;
	private String accountno;
	private Double balance;
	private String bankname;
	private String branchname;
	
	
	public BankAccount() {
		
	}


	public BankAccount(String accounttype, String accountname, String accountno, Double balance, String bankname,
			String branchname) {
		super();
		this.accounttype = accounttype;
		this.accountname = accountname;
		this.accountno = accountno;
		this.balance = balance;
		this.bankname = bankname;
		this.branchname = branchname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAccounttype() {
		return accounttype;
	}


	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}


	public String getAccountname() {
		return accountname;
	}


	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}


	public String getAccountno() {
		return accountno;
	}


	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}


	public String getBankname() {
		return bankname;
	}


	public void setBankname(String bankname) {
		this.bankname = bankname;
	}


	public String getBranchname() {
		return branchname;
	}


	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountname == null) ? 0 : accountname.hashCode());
		result = prime * result + ((accountno == null) ? 0 : accountno.hashCode());
		result = prime * result + ((accounttype == null) ? 0 : accounttype.hashCode());
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((bankname == null) ? 0 : bankname.hashCode());
		result = prime * result + ((branchname == null) ? 0 : branchname.hashCode());
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
		BankAccount other = (BankAccount) obj;
		if (accountname == null) {
			if (other.accountname != null)
				return false;
		} else if (!accountname.equals(other.accountname))
			return false;
		if (accountno == null) {
			if (other.accountno != null)
				return false;
		} else if (!accountno.equals(other.accountno))
			return false;
		if (accounttype == null) {
			if (other.accounttype != null)
				return false;
		} else if (!accounttype.equals(other.accounttype))
			return false;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (bankname == null) {
			if (other.bankname != null)
				return false;
		} else if (!bankname.equals(other.bankname))
			return false;
		if (branchname == null) {
			if (other.branchname != null)
				return false;
		} else if (!branchname.equals(other.branchname))
			return false;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", accounttype=" + accounttype + ", accountname=" + accountname
				+ ", accountno=" + accountno + ", balance=" + balance + ", bankname=" + bankname + ", branchname="
				+ branchname + "]";
	}


	
}
