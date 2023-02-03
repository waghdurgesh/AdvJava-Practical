package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping(value = "/welcome")
	public String showWelcome() {
	System.out.println("in index controller");
		return "/welcome";
	}
}