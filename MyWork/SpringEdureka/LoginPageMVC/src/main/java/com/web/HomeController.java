package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.beans.LoginBean;

@Controller
public class HomeController {
	@GetMapping(value = "/login")
	public String processCredentials(@ModelAttribute("loginbean") LoginBean loginBean) {
		String userid = loginBean.getUserid();
		System.out.println("****" + userid);
		String password = loginBean.getPassword();
		System.out.println("****" + password);
		String message = null;
		String uid = "Durgesh";
		String pass = "123";

		if (userid != "" && userid.length() >= 5) {
			if (userid.equals(uid) && password.equals(pass)) {
				System.out.println("****check succesfull login****");
				message = "Welcome " + userid + "!!";
				loginBean.setMessage(message);
			} else {
				System.out.println("****check unsuccesfull login****");
				message = "Wrong Credentails!";
				loginBean.setMessage(message);
			}
		} else {
			System.out.println("****check invalid credentials****");
			message = "Invalid Credentails!";
			loginBean.setMessage(message);
			;
		}
		return "/results";
	}
}
