package com.app.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.dto.EmployeeResponse;
import com.app.pojos.Employee;

public interface IEmployeeService {
//get emp
	List<Employee> getAllEmployee();

//add emp
	Employee addNewEmployee(Employee emp);

//remove emp
	String deleteEmployee(Long id);

//update emp with resp entity
	ResponseEntity<Employee> editEmployee(Long id, Employee emp);

//update emp
	Employee updateEmployeeDetails(Employee detachedEmp);

//get salary in range
	List<EmployeeResponse> getEmpsBySalary(double minSal, double maxSal);

}
