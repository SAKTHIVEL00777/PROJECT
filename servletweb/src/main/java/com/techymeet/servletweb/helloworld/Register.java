package com.techymeet.servletweb.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
	    String firstName=request.getParameter("firstName");
	    String lastName=request.getParameter("lastName");
	    String emailAddress=request.getParameter("emailAddress");
	    String dateOfBirth=request.getParameter("dateOfBirth");
	    String password=request.getParameter("password");
	    String mobileNumber=request.getParameter("mobileNumber");
	    String address=request.getParameter("address");
	    String city=request.getParameter("city");
	    String state=request.getParameter("state");
	    String country=request.getParameter("country");

		// pw.println("<h3>First Name:</h3>"+ firstName);
	    //response.getWriter().println("firstName");  -->another way println statement
		 	    
	      pw.println(firstName);	    pw.println(lastName);           pw.println(emailAddress);
         
          pw.println(dateOfBirth);      pw.println(password);           pw.println(mobileNumber);
    
          pw.println(address);    pw.println(city);     pw.println(state);      pw.println(country);
          
       
         
	}

}
