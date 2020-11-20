package com.techhub.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.techhub.idao.IBankAccountDao;
import com.techhub.model.BankAccount;
import com.techhub.repository.BankAccountRepository;

@Component
@Transactional
public class BankAccountDao implements IBankAccountDao {

	private final BankAccountRepository bankAccountRepository;
	
	public BankAccountDao(BankAccountRepository bankAccountRepository) {
		
		 this.bankAccountRepository=bankAccountRepository; 
	}
	
	
	@Override
	public void saveBankAccount(BankAccount bankAccount) {
		bankAccountRepository.save(bankAccount);
		
	}

	@Override
	public List<BankAccount> findAll() {
		
		List<BankAccount> bankAccounts = new ArrayList<BankAccount>();

		for (BankAccount bankAccount : bankAccountRepository.findAll()) {
			bankAccounts.add(bankAccount);
		}
		return bankAccounts;
	}

	@Override
	public void deleteById(int accountid) {
		bankAccountRepository.deleteById(accountid);
		
	}

	@Override
	public BankAccount findById(int accountid) {
		
		return bankAccountRepository.findById(accountid).orElse(null);
		
	}

}
