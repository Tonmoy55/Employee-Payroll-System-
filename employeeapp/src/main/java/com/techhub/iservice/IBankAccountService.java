package com.techhub.iservice;

import java.util.List;

import com.techhub.model.BankAccount;

public interface IBankAccountService {

	public void saveBankAccount(BankAccount bankAccount);

	public List<BankAccount> showAllBankAccount();

	public void deleteBankAccount(int accountid);

	public BankAccount editBankAccount(int accountid);
}
