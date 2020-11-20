package com.techhub.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.techhub.dto.EmployeeSalarySheetDTO;
import com.techhub.dto.SalaryGenerationDTO;
import com.techhub.idao.ISalaryGenerationDao;
import com.techhub.repository.EmployeeRepository;

@Component
@Transactional
public class SalaryGenerationDao implements ISalaryGenerationDao {

	private final EmployeeRepository employeeRepository;

	public SalaryGenerationDao(EmployeeRepository employeeRepository) {
		
		 this.employeeRepository = employeeRepository; 
	}

	@Override
	public void generateSalary(SalaryGenerationDTO salaryGenerationDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EmployeeSalarySheetDTO> findAllEmployeeSalary() {
		List<EmployeeSalarySheetDTO> employeeSalaryList = employeeRepository.findAllEmployeeSalary();
		
		return employeeSalaryList;
	}

}
