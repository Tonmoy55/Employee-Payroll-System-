package com.techhub.repository;

import org.springframework.data.repository.CrudRepository;
import com.techhub.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
