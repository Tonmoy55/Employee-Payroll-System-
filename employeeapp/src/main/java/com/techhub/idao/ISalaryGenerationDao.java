package com.techhub.idao;



import java.util.List;

import com.techhub.dto.EmployeeSalarySheetDTO;
import com.techhub.dto.SalaryGenerationDTO;


public interface ISalaryGenerationDao {

	public void generateSalary(SalaryGenerationDTO salaryGenerationDTO);
	
	public List<EmployeeSalarySheetDTO> findAllEmployeeSalary();
}
