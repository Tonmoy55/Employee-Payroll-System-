package com.techhub.iservice;

import java.util.List;

import com.techhub.model.Employee;

public interface IEmployeeService {

	public void saveEmployee(Employee employee);

	public List<Employee> showAllEmployee();

	public void deleteEmployee(int employeeid);

	public Employee editEmployee(int employeeid);
}
