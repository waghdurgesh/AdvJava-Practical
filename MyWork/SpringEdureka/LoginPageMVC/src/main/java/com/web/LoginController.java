package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping(value = "/")
	public String showLogin() {
		
	System.out.println("in index controller");
		return "/login";
	}
}
