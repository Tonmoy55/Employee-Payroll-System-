package com.techhub.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techhub.iservice.IEmployeeService;
import com.techhub.model.Employee;


@Controller
public class EmployeeInformationSetupController {

	@Autowired
	private IEmployeeService iEmployeeService;
	
	@RequestMapping("/employeeinformationsetup")
	public String gradeStuup(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_EMPLOYEE_INFORMATION_SETUP");
		return "employeeinformationsetup";
	}
	
	@PostMapping("/saveemployee")
	public String SaveEmployee(@ModelAttribute Employee employee,BindingResult BindingResult,HttpServletRequest request) {
		iEmployeeService.saveEmployee(employee);
		request.setAttribute("mode", "MODE_SUCCESS");
		return "employeeinformationsetup";
	}
	
	
	@RequestMapping("/show-all-employee")
	public String ShowAllBankaccount(HttpServletRequest request) {
		request.setAttribute("employees", iEmployeeService.showAllEmployee());
		request.setAttribute("mode", "SHOW_ALL_EMPLOYEE");
		return "employeeinformationsetup";
	}
	
	@RequestMapping("/delete-employee")
	public String DeleteGrade(@RequestParam int id,HttpServletRequest request) {
		iEmployeeService.deleteEmployee(id);
		request.setAttribute("employees", iEmployeeService.showAllEmployee());
		request.setAttribute("mode", "SHOW_ALL_EMPLOYEE");
		return "employeeinformationsetup";
	}
	
	@RequestMapping("/edit-employee")
	public String editGrade(@RequestParam int id,HttpServletRequest request) {
		request.setAttribute("employee", iEmployeeService.editEmployee(id));
		request.setAttribute("mode", "MODE_UPDATE_EMPLOYEE");
		return "employeeinformationsetup";
	}
	
	@PostMapping("/updateemployee")
	public String updateUser(@ModelAttribute Employee employee,BindingResult BindingResult,HttpServletRequest request) {
		iEmployeeService.saveEmployee(employee);
		request.setAttribute("mode", "MODE_UPDATE_SUCCESS");
		return "employeeinformationsetup";
	}
	
}
