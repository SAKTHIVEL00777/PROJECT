package com.techymeet.webtechnology.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee
 */
@WebServlet("/employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * // TODO Auto-generated method stub
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 * System.out.println("do get");
		 */
		RequestDispatcher rd=request.getRequestDispatcher("employee.html");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     response.setContentType("text/html");
	     
	     PrintWriter pw=response.getWriter();
	     
	 String employeeName=request.getParameter("employeeName");
	 String email=request.getParameter("email");
	 String dateOfBirth=request.getParameter("dateOfBirth");
	 String password=request.getParameter("password");
	 String mobileNumber=request.getParameter("mobileNumber");
     String gender=request.getParameter("gender");  
	 String[] role=request.getParameterValues("role"); 
	 String address=request.getParameter("address"); 
	 String city=request.getParameter("city");
	 String state=request.getParameter("state");
	 String country=request.getParameter("country");
	 
	  pw.println(employeeName);   
	  pw.println(email); 
	  pw.println(dateOfBirth);   
	  pw.println(password); 
	  pw.println(mobileNumber);   
	  pw.println(gender);    
	  pw.println(Arrays.toString(role));            
	  pw.println(address); 
	  pw.println(city);            
	  pw.println(state);     
	  pw.println(country);
	  
	}

}
