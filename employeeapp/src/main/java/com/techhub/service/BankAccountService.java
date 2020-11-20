package com.techhub.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techhub.idao.IBankAccountDao;
import com.techhub.iservice.IBankAccountService;
import com.techhub.model.BankAccount;

@Service
public class BankAccountService implements IBankAccountService{

	@Autowired
	private IBankAccountDao iBankAccountDao;
	
	
	@Override
	public void saveBankAccount(BankAccount bankAccount) {
		
		iBankAccountDao.saveBankAccount(bankAccount);
		
	}

	@Override
	public List<BankAccount> showAllBankAccount() {
		List<BankAccount>  bankAccount = iBankAccountDao.findAll();
		return bankAccount;
	}

	@Override
	public void deleteBankAccount(int accountid) {
		
		iBankAccountDao.deleteById(accountid);
	}

	@Override
	public BankAccount editBankAccount(int accountid) {
		
		return iBankAccountDao.findById(accountid);
	}

	
}
