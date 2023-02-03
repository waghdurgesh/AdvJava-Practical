package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.EmployeeResponse;
import com.app.pojos.Employee;
import com.app.services.IEmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/employees")
public class EmployeeController {
	// Dependency Service layer I/F
	@Autowired
	private IEmployeeService empService;

	public EmployeeController() {
		System.out.println("***Inside Emp Controller*** Def. Constructor =" + getClass());
	}

	// get mapping with http://localhost:port/employees
	@GetMapping
	public List<Employee> getEmployees() {
		System.out.println("***Inside get Employee***");
		return empService.getAllEmployee();
	}

	// post mapping with http://localhost:port/employees
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee emp) {
		System.out.println("***In save emp***" + emp);
		return empService.addNewEmployee(emp);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		System.out.println("***In Delete Emp***");
		empService.deleteEmployee(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee emp) {
		System.out.println("***In Update Employee***");
		return empService.editEmployee(id, emp);
	}

	@PutMapping
	public Employee updateEmpDetails(@RequestBody Employee emp) {
		System.out.println("***In Update Emp Details***" + emp.getId());
		return empService.updateEmployeeDetails(emp);
	}

	@GetMapping("/salary")
	public List<EmployeeResponse> getAllEmpsBySalaryRange(@RequestParam double minSal, double maxSal) {
		System.out.println("***In get Emp By Salary***" + minSal + " " + maxSal);
		return empService.getEmpsBySalary(minSal, maxSal);
	}
}
