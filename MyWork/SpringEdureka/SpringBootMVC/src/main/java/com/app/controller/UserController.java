package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojo.Role;
import com.app.pojo.User;
import com.app.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	// service layer interface dependency
	@Autowired
	private UserService userService;

	public UserController() {
		System.out.println("****in default constructor of " + getClass());
	}

	@GetMapping("/login")
	public String showLoginPage(Model map) {
		System.out.println("****in show login page ");
		return "/users/login";
		// handler return logical view name to dispatcher servlet to view resolver gives
		// actual view name /WEB-INF/views/index.jsp
	}

	// for auth and authorization
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String email, @RequestParam String pass, Model map,
			HttpSession session) {
		System.out.println("******in processLoginForm " + email + " " + pass + " " + map);
		try {
			User user = userService.validateUser(email, pass);
			// validate login--> role based authentication
			session.setAttribute("user-Details", user);
			if (user.getUserRole().equals(Role.ADMIN))
				return "redirect:/admin/main";
			// redirect view returned
			// DispatcherServlet skips view resolver
			// send temp redirect resp to client
			// Spring container 302(redirect) location:/admin/main body:empty
			// client now send next request -->http://host:port/ctx path/admin/main , method
			// : GET
			// PRG : post-redirect-get
			// customer login
			return "redirect:/customer/categories";
			// Actual view name --> /WEB-INF/views/customer/categories.jsp

		} catch (RuntimeException e) {
			System.out.println("***error in " + getClass() + "" + e);
			map.addAttribute("message", "Invalid Login, Please retry!!!");
			return "/users/login";
		}
	}
}
