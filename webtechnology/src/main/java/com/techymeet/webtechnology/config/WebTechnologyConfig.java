package com.techymeet.webtechnology.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class WebTechnologyConfig implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext scontext=sce.getServletContext();
		scontext.setAttribute("applicationName", "WEBTECHNOLOGY");
		scontext.setInitParameter("company", "SOFTTWIG");

		
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	
		System.out.println("Servlet Context Destroyed");
	}

}
