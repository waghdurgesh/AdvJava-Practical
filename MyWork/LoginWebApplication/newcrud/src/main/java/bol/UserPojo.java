package bol;

import java.sql.Date;

public class UserPojo {

	private int user_id = 0;
	private String user_name = null;
	private String user_email = null;
	private String user_password = null;
	private double user_reg_amt = 0.0;
	private Date user_reg_date = null;
	private String user_role = null;
	
	
	public UserPojo() {
		
	}

	public UserPojo(int user_id, String user_name, String user_email, String user_password, double user_reg_amt,
			Date user_reg_date, String user_role) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_reg_amt = user_reg_amt;
		this.user_reg_date = user_reg_date;
		this.user_role = user_role;
	}

	@Override
	public String toString() {
		return "UserPojo [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", user_password=" + user_password + ", user_reg_amt=" + user_reg_amt + ", user_reg_date="
				+ user_reg_date + ", user_role=" + user_role + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public double getUser_reg_amt() {
		return user_reg_amt;
	}

	public void setUser_reg_amt(double user_reg_amt) {
		this.user_reg_amt = user_reg_amt;
	}

	public Date getUser_reg_date() {
		return user_reg_date;
	}

	public void setUser_reg_date(Date user_reg_date) {
		this.user_reg_date = user_reg_date;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

}