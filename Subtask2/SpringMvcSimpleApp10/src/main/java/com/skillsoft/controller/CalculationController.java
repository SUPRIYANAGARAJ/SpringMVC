package com.skillsoft.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculationController {
	
	/*@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String greeting(
			@RequestParam("number1") int number1,
			@RequestParam("number2") int number2,
			Model model) {
		
		String message = "Here are your calculation results for: " + number1 +
				" and " + number2;
		
		model.addAttribute("message", message);
		
		model.addAttribute("sum", (number1 + number2));
		model.addAttribute("subtract", (number1 - number2));
		model.addAttribute("multiply", (number1 * number2));
		model.addAttribute("divide", (number1 / number2));
		
		return "resultsPage";
	}*/
	
	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String greeting(
			@RequestParam("number1") int number1,
			@RequestParam("number2") int number2,
			Model model) throws SQLException {
			
		if (number1 > 1000) {
			throw new IllegalArgumentException("This number is not valid");
		}
		
		if(number2 > 1000) {
			throw new SQLException("Data could not be retrieved from the database");
		}
		
		String message = "Here are your calculation results for: " + number1 +
				" and " + number2;
		
		model.addAttribute("message", message);
		
		model.addAttribute("sum", (number1 + number2));
		model.addAttribute("subtract", (number1 - number2));
		model.addAttribute("multiply", (number1 * number2));
		model.addAttribute("divide", (number1 / number2));
		
		return "resultsPage";

}
}
