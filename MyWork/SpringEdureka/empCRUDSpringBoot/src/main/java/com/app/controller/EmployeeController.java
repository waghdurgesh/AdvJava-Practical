package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.services.IEmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService empServices;

	public EmployeeController() {
		System.out.println("***In Emp ctrl***");
	}

	// get--> get all emp
	@GetMapping
	public List<Employee> getEmployees() {
		System.out.println("***In get Employee***");
		return empServices.getAllEmployee();
	}

	// post--> add new emp
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee emp) {
		System.out.println("***in Save Emp" + emp);
		return empServices.addNewEmployee(emp);
	}

}
