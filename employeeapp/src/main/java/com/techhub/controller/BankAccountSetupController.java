package com.techhub.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.techhub.iservice.IBankAccountService;
import com.techhub.model.BankAccount;


@Controller
public class BankAccountSetupController {

	@Autowired
	private IBankAccountService iBankAccountService;
	
	@RequestMapping("/bankaccountsetup")
	public String bankAccountSetup(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_BANK_ACCOUNT_SETUP");
		return "bankaccountsetup";
	}
	
	@PostMapping("/savebankaccount")
	public String SaveUser(@ModelAttribute BankAccount bankAccount,BindingResult BindingResult,HttpServletRequest request) {
		iBankAccountService.saveBankAccount(bankAccount);
		request.setAttribute("mode", "MODE_SUCCESS");
		return "bankaccountsetup";
	}
	
	
	@RequestMapping("/show-all-bankaccount")
	public String ShowAllBankaccount(HttpServletRequest request) {
		request.setAttribute("bankaccounts", iBankAccountService.showAllBankAccount());
		request.setAttribute("mode", "SHOW_ALL_BANK_ACCOUNT");
		return "bankaccountsetup";
	}
	
	@RequestMapping("/delete-bankaccount")
	public String DeleteGrade(@RequestParam int id,HttpServletRequest request) {
		iBankAccountService.deleteBankAccount(id);
		request.setAttribute("bankaccounts", iBankAccountService.showAllBankAccount());
		request.setAttribute("mode", "SHOW_ALL_BANK_ACCOUNT");
		return "bankaccountsetup";
	}
	
	@RequestMapping("/edit-bankaccount")
	public String editGrade(@RequestParam int id,HttpServletRequest request) {
		request.setAttribute("bankAccount", iBankAccountService.editBankAccount(id));
		request.setAttribute("mode", "MODE_UPDATE_BANK_ACCOUNT");
		return "bankaccountsetup";
	}
	
	@PostMapping("/updatebankaccount")
	public String updateUser(@ModelAttribute BankAccount bankAccount,BindingResult BindingResult,HttpServletRequest request) {
		iBankAccountService.saveBankAccount(bankAccount);
		request.setAttribute("mode", "MODE_UPDATE_SUCCESS");
		return "bankaccountsetup";
	}
	
}
