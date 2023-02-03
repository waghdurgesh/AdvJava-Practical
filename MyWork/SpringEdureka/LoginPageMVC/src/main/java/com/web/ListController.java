package com.web;

import java.util.Date;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

@Controller
@RequestMapping(value = "/details")
public class ListController {
	@GetMapping(value = "/list1")
	public ModelAndView testmodandview() {
		System.out.println("***in list controller***");
		return new ModelAndView("/display/list","server_test",LocalDateTime.now());
		
	}

	@GetMapping(value = "/list2")
	public String testModelMap(Model modelmap) {
		System.out.println("***in testmodelmap***"+modelmap);
		modelmap.addAttribute("server_test", new Date()).addAttribute("number_list",Arrays.asList(10,20));
		System.out.println("***in testmodelmap***"+modelmap);
		System.out.println("****in list2 controller****");
		return "/display/list";
		
	}
}
