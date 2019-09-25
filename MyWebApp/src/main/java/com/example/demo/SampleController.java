package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@RequestMapping("home")
	public String initialMethod() {
		System.out.println("Controller");
		return "home.jsp";
	}
}
