package com.techhub.idao;

import java.util.List;

import com.techhub.model.BankAccount;

public interface IBankAccountDao {

    public void saveBankAccount(BankAccount bankAccount);
	
	public List<BankAccount> findAll();
	
	public void deleteById(int accountid);
	
	public BankAccount findById(int accountid);
}
