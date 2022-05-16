package com.skillsoft;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingsController {
	
	@RequestMapping("/hello")
	//public String greeting(HttpServletRequest req, Model model) {
	public String greeting(@RequestParam String name, Model model) {
		
		//String name = req.getParameter("name");
		
		String msg = "Hello" + name;
		
		model.addAttribute("message", msg);
		
		return "greetingPage";
		
	}

}
