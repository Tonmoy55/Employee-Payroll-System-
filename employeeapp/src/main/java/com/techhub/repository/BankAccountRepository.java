package com.techhub.repository;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.techhub.model.BankAccount;


public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {
	
	@Modifying
	@Query("UPDATE BankAccount SET balance = :companyNewBalance WHERE id=:id")
	@Transactional
	void updateCompanyBankAccountInfo(int id, BigInteger companyNewBalance);
	
	@Modifying
	@Query("UPDATE BankAccount SET balance = :employeeNewBalance WHERE accountno=:accountno")
	@Transactional
	void updateEmployeeBankAccountInfo(String accountno, BigInteger employeeNewBalance);
	
	public BankAccount findByAccountno(String accountno);
	
}
