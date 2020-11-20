package com.techhub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.techhub.dto.EmployeeSalarySheetDTO;
import com.techhub.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	

	@Query("SELECT new com.techhub.dto.EmployeeSalarySheetDTO(A.id , A.employeename , C.gradename  , B.balance) FROM Employee AS A INNER JOIN BankAccount AS B ON A.bankAccount = B.id  INNER JOIN Grade AS C ON A.grade = C.id")
	public List<EmployeeSalarySheetDTO> findAllEmployeeSalary();

}
