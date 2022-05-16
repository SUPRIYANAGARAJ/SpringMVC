package com.skillsoft.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.mvc.Controller;

@Configuration
public class ApplicationContextConfiguration {
	
	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
	    return viewResolver ;
		
	}
	
	@Bean(name="/")
	public Controller getMessageDisplayController() {
		return new MessageDisplayController();
	}


}
