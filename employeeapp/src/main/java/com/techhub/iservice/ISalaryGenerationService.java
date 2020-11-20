package com.techhub.iservice;

import java.util.List;

import com.techhub.dto.EmployeeSalarySheetDTO;
import com.techhub.dto.SalaryGenerationDTO;

public interface ISalaryGenerationService {

	public void salaryGeneration(SalaryGenerationDTO salaryGenerationDTO);
	
	public List<EmployeeSalarySheetDTO> showAllEmployeeSalarySheet();
}
