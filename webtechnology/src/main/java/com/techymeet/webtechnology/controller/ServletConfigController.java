package com.techymeet.webtechnology.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigController
 */
@WebServlet(
		urlPatterns = { "/servletConfigController" }, 
		initParams = { 
				@WebInitParam(name = "companyAddress", value = "CHENNAI"), 
				@WebInitParam(name = "mobileNumber", value = "9688764121")
		})
public class ServletConfigController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw=response.getWriter();
		ServletConfig sconfig=getServletConfig();
		
		String companyAddress=sconfig.getInitParameter("companyAddress");
		String mobileNumber=sconfig.getInitParameter("mobileNumber");
		
		pw.println(companyAddress);
		pw.println(mobileNumber);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
