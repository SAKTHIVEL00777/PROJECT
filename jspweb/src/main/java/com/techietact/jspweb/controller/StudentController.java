package com.techietact.jspweb.controllere;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techietact.jspweb.bo.StudentBo;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/student")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		
		request.setAttribute("name", "MESSI");
		request.setAttribute("successMessage", "Student Creation Success");
		request.setAttribute("errorMessage", "Student Creation Failed");

		
		session.setAttribute("loggedInUser", "webdevloper@gmail.com");
		
		List<StudentBo> list=new ArrayList<>();
		StudentBo bo=new StudentBo();
		
		bo.setStudId(17);
		bo.setStudName("ABD");
		bo.setEmail("abd17@gmail.com");
		
		request.setAttribute("bo", bo);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("student.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
