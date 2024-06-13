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

import com.techietact.jspweb.bo.EmployeeBo;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/employee")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		
		request.setAttribute("name", "MSD");
		
		session.setAttribute("userType", "Student");
	   //session.setAttribute("userType", "Admin");
		
		List<EmployeeBo> list=new ArrayList<EmployeeBo>();
		
		EmployeeBo bo1=new EmployeeBo();
		bo1.setEmpId(45);
		bo1.setFirstName("Rohit");
		bo1.setLastName("sharma");
		
		EmployeeBo bo2=new EmployeeBo();
		bo2.setEmpId(18);
		bo2.setFirstName("Virat");
		bo2.setLastName("Kholi");
		
		list.add(bo1);
		list.add(bo2);
		
		request.setAttribute("list", list);
	
	
		RequestDispatcher rd=request.getRequestDispatcher("employee.jsp");
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
