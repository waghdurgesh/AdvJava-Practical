package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "new_emps")
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true, exclude = "password")
public class Employee extends BaseEntity {
	@Column(length = 20)
	private String firstname;
	@Column(length = 20)
	private String lastname;
	@Column(length = 30, unique = true)
	private String email;
	@Column(length = 20, nullable = false)
	private String passsword;
	@Column(length = 20)
	@JsonProperty(value = "location")
	private String workLocation;
	@Column(length = 20)
	private String department;
	private LocalDate joinDate;
	private double salary;

	public Employee() {
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

	public String getPasssword() {
		return passsword;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
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

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String firstname, String lastname, String email, String passsword, String workLocation,
			String department, LocalDate joinDate, double salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.passsword = passsword;
		this.workLocation = workLocation;
		this.department = department;
		this.joinDate = joinDate;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", workLocation="
				+ workLocation + ", department=" + department + ", joinDate=" + joinDate + ", salary=" + salary + "]";
	}

}
