package com.skillsoft.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		//AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		XmlWebApplicationContext appContext = new XmlWebApplicationContext();
		//appContext.register(ApplicationContextConfiguration.class);
		appContext.setConfigLocation("/WEB-INF/application-context.xml");

		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher",
				new DispatcherServlet(appContext));

		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
		

	}

}
