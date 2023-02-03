package com.app.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.pojos.Employee;

public interface IEmployeeService {
//get emp
	List<Employee> getAllEmployee();

//add emp
	Employee addNewEmployee(Employee emp);

//remove emp
	String deleteEmployee(Long id);

//update emp
	ResponseEntity<Employee> editEmployee(Long id, Employee emp);
}
