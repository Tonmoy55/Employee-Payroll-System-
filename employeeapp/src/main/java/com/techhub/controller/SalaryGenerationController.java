package com.techhub.controller;


import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techhub.dto.SalaryGenerationDTO;

import com.techhub.iservice.ISalaryGenerationService;


@Controller
public class SalaryGenerationController {

	@Autowired
	private ISalaryGenerationService iSalaryGenerationService;
	
	@RequestMapping("/generatesalary")
	public String gradeStuup(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_GENERATE_SALARY");
		return "salarygenerate";
	}
	
	
	@PostMapping("/salarygeneration")
	public String SaveUser(@ModelAttribute SalaryGenerationDTO salaryGenerationDTO,BindingResult BindingResult,HttpServletRequest request) {
		iSalaryGenerationService.salaryGeneration(salaryGenerationDTO);
		request.setAttribute("mode", "MODE_SUCCESS");
		return "salarygenerate";
	}
	
	@RequestMapping("/print-salary-sheet")
	public String ShowAllBankaccount(HttpServletRequest request) {
		request.setAttribute("salarysheets", iSalaryGenerationService.showAllEmployeeSalarySheet());
		request.setAttribute("mode", "SHOW_EMPLOYEE_SALARY_SHEET");
		return "salarygenerate";
	}
	
}
