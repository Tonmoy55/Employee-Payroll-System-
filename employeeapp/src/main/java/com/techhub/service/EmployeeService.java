package com.techhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techhub.idao.IEmployeeDao;
import com.techhub.iservice.IEmployeeService;
import com.techhub.model.Employee;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	private IEmployeeDao iEmployeeDao;
	
	
	@Override
	public void saveEmployee(Employee employee) {
		iEmployeeDao.saveEmployee(employee);
		
	}
	
	@Override
	public List<Employee> showAllEmployee() {
		List<Employee>  employee = iEmployeeDao.findAll();
		return employee;
	}

	@Override
	public void deleteEmployee(int employeeid) {
		iEmployeeDao.deleteById(employeeid);
		
	}

	@Override
	public Employee editEmployee(int employeeid) {
		return iEmployeeDao.findById(employeeid);
	}

	
}
