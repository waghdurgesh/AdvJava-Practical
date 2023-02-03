package com.app.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {
	public IndexPageController() {
		System.out.println("****in default constructor of " + getClass());
	}

	@RequestMapping("/")
	public String showIndexPage(Model map) {
		System.out.println("****in show index page ");
		map.addAttribute("server_ts", new Date());
		return "/index";
		// handler return logical view name to dispatcher servlet to view resolver gives
		// actual view name /WEB-INF/views/index.jsp
	}

}
