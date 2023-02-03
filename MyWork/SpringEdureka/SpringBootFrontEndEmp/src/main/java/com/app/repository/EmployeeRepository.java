package com.app.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	// custom query for get emp name by sal
	@Query(value = "select new com.app.pojos.Employee(firstname,lastname) from Employee e where e.salary between ?1 and ?2")
	// List<Employee> fetchEmpNamesBySalaryRange(double minSalary,double
	// maxSalary);
	Stream<Employee> fetchEmpNamesBySalaryRange(double minSal, double maxSal);
}