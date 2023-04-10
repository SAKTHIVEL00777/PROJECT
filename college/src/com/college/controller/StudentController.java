package com.college.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.testng.log4testng.Logger;

import com.college.bo.StudentBo;
import com.college.service.StudentService;

@Controller
public class StudentController {
	
	private Logger logger =Logger.getLogger(StudentController.class);

	@Autowired
	StudentService service;
	
	@RequestMapping(value="/createstudent",method=RequestMethod.GET)
	public String create(Model model)
	{ 
		StudentBo studentBo=new StudentBo();
		logger.info("error");
		model.addAttribute("studentBo",  studentBo );
		return "createStudent";
		
	}
	
	@RequestMapping(value="/createstudent",method=RequestMethod.POST)
	public String createStudent(Model model,@Valid @ModelAttribute("studentBo")StudentBo studentBo,BindingResult br )
	{
		
		if(br.hasErrors())
		{
			return "createStudent";
		}
		int count=service.createStudent(studentBo);
		if(count>0)
		{
			model.addAttribute("studentBo",  studentBo );
			return "login";
		}
		
		return "createStudent";
}
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String viewList(Model model)
	{
		List<StudentBo> list=new ArrayList<StudentBo>();
		list=service.viewList();
		if(null!=list)
		{
			model.addAttribute("sms", list);
		}
		return "viewStudent";
		
	}
	
	@RequestMapping(value="/editstudent",method=RequestMethod.GET)
	public String editStudent(Model model,HttpServletRequest req,HttpServletResponse res)
	{
		String studId=req.getParameter("studId");
		if(null!=studId&& !studId.isEmpty())
		{
			int studId1=Integer.parseInt(studId);
			StudentBo studentBo=new StudentBo();
			studentBo=service.editStudent(studId1);
			
			if(null!=studentBo)
			{
				model.addAttribute("studentBo", studentBo);
			}
		}
		
		
		return "editStudent";
		
	}
	
	@RequestMapping(value="/editstudent",method=RequestMethod.POST)
	public String editStudent(Model model,@Valid @ModelAttribute("studentBo")StudentBo studentBo,BindingResult br)
	{
		if(br.hasErrors())
		{
			return"editStudent";
		}
		
		int count=service.editStudent(studentBo);
		if(count>0)
		{
			model.addAttribute("studentBo",  studentBo );
		}
		
		return"editStudent";
		
	}
	
	@RequestMapping(value="/deletestudent",method=RequestMethod.GET)
	public String deleteStudent(Model model,HttpServletRequest req,HttpServletResponse res)
	{
		String StudId=req.getParameter("studId");
		if(null!=StudId && !StudId.isEmpty())
		{
			int StudId1=Integer.parseInt(StudId);
			int count=service.deleteStudent(StudId1);
			if(count>0)
			{
				model.addAttribute("sms", "value delete");
			}
			else
			{
				model.addAttribute("sms", "value not delete");
			}
		}
		return "redirect:/view";
		
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginStudent(Model model)
	{
		
	  model.addAttribute("studentBo", new StudentBo());
		
		return "login";
		
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginStudent(Model model,@ModelAttribute("studentBo")StudentBo studentBo,HttpServletRequest req,HttpServletResponse res)
	{
		studentBo=service.loginStudent(studentBo.getEmail(),studentBo.getPassword());
		
		if(studentBo.getStudId()>0)
		{
			model.addAttribute("message", "login success");
			HttpSession s=req.getSession();
			
			model.addAttribute("studentBo", new StudentBo());
			s.setAttribute("email", studentBo.getEmail());
			s.setAttribute("password", studentBo.getPassword());
		}
		else
		{
			model.addAttribute("message", " invalid login.....");
		}
		
		return "redirect:/profile";
		
	}
	
	@RequestMapping(value="/profile",method=RequestMethod.GET)
	public String profile(Model model,HttpServletRequest req,HttpServletResponse res)
	{
		
		StudentBo studentBo=new StudentBo();
		HttpSession s=req.getSession();
		String email= (String) s.getAttribute("email");
		String password=(String) s.getAttribute("password");
		studentBo=service.login(email, password);
		
		if(studentBo.getStudId()>0)
		{
			model.addAttribute("s",studentBo);
			return "myInfo";
		}
		else
		{
			model.addAttribute("message", " invalid login.....");
		}
		return "login";
		
	}
	

}
