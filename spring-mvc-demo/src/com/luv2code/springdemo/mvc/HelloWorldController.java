package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//New controller method to read form data
	//and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model  model) {
		String studentName = request.getParameter("studentName");
		
		studentName = studentName.toUpperCase();
		
		model.addAttribute("message", studentName);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String studentName , Model  model) {

		studentName = studentName.toUpperCase();
		
		model.addAttribute("message", studentName);
		
		return "helloworld";
	}
}
