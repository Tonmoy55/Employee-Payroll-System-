package com.techhub.idao;

import java.util.List;

import com.techhub.model.Employee;

public interface IEmployeeDao {

	public void saveEmployee(Employee employee);

	public List<Employee> findAll();

	public void deleteById(int employeeid);

	public Employee findById(int employeeid);
}
