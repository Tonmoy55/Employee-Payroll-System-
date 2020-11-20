package com.techhub.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.techhub.idao.IEmployeeDao;
import com.techhub.model.Employee;
import com.techhub.repository.EmployeeRepository;

@Component
public class EmployeeDao implements IEmployeeDao {

	private final EmployeeRepository employeeRepository;

	public EmployeeDao(EmployeeRepository employeeRepository) {
		
		 this.employeeRepository=employeeRepository; 
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<Employee>();

		for (Employee employee : employeeRepository.findAll()) {
			employees.add(employee);
		}
		return employees;
	}

	@Override
	public void deleteById(int employeeid) {
		employeeRepository.deleteById(employeeid);

	}

	@Override
	public Employee findById(int employeeid) {
		return employeeRepository.findById(employeeid).orElse(null);
	}

}
