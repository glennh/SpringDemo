package com.glennh.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {
		//String theName = request.getParameter("studentName");
		String result = "yo " + theName.toUpperCase();
		model.addAttribute("message", result);
		return "helloworld";
	}
}
