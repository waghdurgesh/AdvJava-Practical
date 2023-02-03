package com.app.services;

import java.util.List;

import com.app.pojos.Employee;

public interface IEmployeeService {

	// get emp
	List<Employee> getAllEmployee();

	// add emps
	Employee addNewEmployee(Employee emp);

}
