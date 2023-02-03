package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "users_tbl")
public class User extends BaseEntity {
	@Column(name = "first_name", length = 20)
	private String firstname;
	@Column(name = "last_name", length = 20)
	private String lastName;
	@Column(name = "email", unique = true)
	private String email;
	@Column(name = "password", nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(name = "user_role", length = 20)
	private Role userRole;

	private LocalDate dob;

	public User() {

	}

	public User(String firstname, String lastName, String email, String password, Role userRole, LocalDate dob) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userRole = userRole;
		this.dob = dob;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Role getUserRole() {
		return userRole;
	}

	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastName=" + lastName + ", email=" + email + ", password=" + password
				+ ", userRole=" + userRole + ", dob=" + dob + "]";
	}

}
