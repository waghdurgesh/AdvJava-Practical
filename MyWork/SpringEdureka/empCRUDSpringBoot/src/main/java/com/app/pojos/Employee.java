package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true, exclude = "password")
@Entity
@Table(name = "employee")
public class Employee extends BaseEntity {

	@Column(length = 20)
	private String firstname;
	@Column(length = 20)
	private String lastname;
	@Column(length = 20, unique = true, nullable = false)
	private String email;
	@Column(length = 20, unique = true, nullable = false)
	private String password;
	@Column(length = 20)
	private String workLocation;
	@Column(length = 20)
	private String department;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstname, String lastname, String email, String password, String workLocation,
			String department, double salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.workLocation = workLocation;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", workLocation="
				+ workLocation + ", department=" + department + ", salary=" + salary + "]";
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
