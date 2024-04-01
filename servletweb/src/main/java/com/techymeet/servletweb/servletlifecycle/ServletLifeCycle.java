package com.techymeet.servletweb.servletlifecycle;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/servletLifeCycle")  //--->url pattern
public class ServletLifeCycle extends HttpServlet{
	
	public void init() {
		System.out.println("Init Method....");
	}
	public void service(ServletRequest request,ServletResponse response) {
		System.out.println("Service Method...");
	}
	public void destroy() {
		System.out.println("Destroy Method....");
	}
	
}
