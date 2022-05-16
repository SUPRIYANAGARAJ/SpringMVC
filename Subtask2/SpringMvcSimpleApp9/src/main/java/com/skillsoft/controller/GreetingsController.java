package com.skillsoft.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingsController {
	
	/*@RequestMapping("/hello")
	public String greeting(@RequestParam("studentName") String name,
			@RequestParam String major,
			Model model) {
		
		String msg = "Hello " + name + " welcome to your major : " + major;
		
		model.addAttribute("message", msg);
		
		return "greetingPage";
		
	}*/
	
	/*@RequestMapping("/hello")
	public String greeting(@RequestParam("studentName") String name,
			@RequestParam(required = false) String major,
			Model model) {
		
		String msg = "Hello " + name + " welcome to your major : " + major;
		
		if (major != null && !major.isEmpty()) {
			msg = msg + " welcome to your major: " + major;
		}
		
		model.addAttribute("message", msg);
		
		return "greetingPage";
		
	}*/
	
	/*@RequestMapping("/hello")
	public String greeting(@RequestParam("studentName") String name,
			@RequestParam(defaultValue = "English") String major,
			Model model) {
		
		String msg = "Hello " + name + " welcome to your major : " + major;
		
		model.addAttribute("message", msg);
		
		return "greetingPage";
		
	}*/
	
	@RequestMapping(value= "/hello", method = RequestMethod.GET)
	public String greeting(@RequestParam Map<String, String> allParametersMap,
			Model model) {
		
		String name = allParametersMap.get("studentName");
		
		String major = allParametersMap.get("major");
		
		String advisor = allParametersMap.get("advisor");
		
		String msg = "Hello " + name + " welcome to your major : " + major +
				      ", your advisor is : " + advisor;
		
		System.out.println(msg);
		
		model.addAttribute("message", msg);
		
		return "greetingPage";
		
	}
	
	
	

}
