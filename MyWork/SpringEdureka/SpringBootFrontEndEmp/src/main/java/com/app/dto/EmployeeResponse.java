package com.app.dto;

//@Getter
//@Setter
//@NoArgsConstructor
public class EmployeeResponse {
	private String firstname;
	private String lastname;

	public EmployeeResponse() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeResponse(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

}
