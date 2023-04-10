package com.college.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.index.CheckIndex.Status.SegmentInfoStatus;
import org.apache.poi.hpsf.wellknown.SectionIDMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.college.bo.StudentBo;
import com.college.dao.StudentDao;
import com.college.vo.LoginVo;
import com.college.vo.StudentVo;

@Service
@Transactional
public class StudentServiceImp implements StudentService{
  @Autowired
   StudentDao dao;
  
	@Override
	public int createStudent(StudentBo studentBo) {
		
		StudentVo vo=new StudentVo();
		
		vo.setName(studentBo.getName());
		vo.setEmail(studentBo.getEmail());
		vo.setPassword(studentBo.getPassword());
		vo.setMobile(studentBo.getMobile());
		vo.setUserRole(studentBo.getUserRole());
		
		int count=dao.createStudent(vo);
		
		if(count>0)
		{
			LoginVo loginvo=new LoginVo();
			
			loginvo.setName(studentBo.getName());
			loginvo.setEmail(studentBo.getEmail());
			loginvo.setPassword(studentBo.getPassword());
			loginvo.setMobile(studentBo.getMobile());
			loginvo.setUserRole(studentBo.getUserRole());
			
			vo.setStudId(count);
			loginvo.setStudentvo(vo);
			
			 int loginId=dao.studLogin(loginvo);
		}
		return count;
	}

	@Override
	public List<StudentBo> viewList() {
	
		List<StudentBo> list=new ArrayList<StudentBo>();
		List<LoginVo> listvo=new ArrayList<LoginVo>();
		
		listvo=dao.viewList();
		
		for(LoginVo vo:listvo)
		{
			StudentBo studentBo= new StudentBo(); 
			
			studentBo.setStudId(vo.getLoginId());
			studentBo.setName(vo.getName());
			studentBo.setEmail(vo.getEmail());
			studentBo.setPassword(vo.getPassword());
			studentBo.setMobile(vo.getMobile());
			studentBo.setUserRole(vo.getUserRole());
			
			list.add(studentBo);
		}
		return list;
	}

	@Override
	public StudentBo editStudent(int studId1) {
		
		StudentBo studentBo= new StudentBo(); 
		StudentVo vo=new StudentVo();
		
		vo=dao.editStudent(studId1);
		
		if(null!=vo)
		{
			studentBo.setStudId(vo.getStudId());
			studentBo.setName(vo.getName());
			studentBo.setEmail(vo.getEmail());
			studentBo.setPassword(vo.getPassword());
			studentBo.setMobile(vo.getMobile());
			studentBo.setUserRole(vo.getUserRole());
		}
		return studentBo;
	}

	@Override
	public int editStudent(StudentBo studentBo) {
		
		StudentVo vo=new StudentVo();
		
		vo.setStudId(studentBo.getStudId());
		vo.setName(studentBo.getName());
		vo.setEmail(studentBo.getEmail());
		vo.setPassword(studentBo.getPassword());
		vo.setMobile(studentBo.getMobile());
		vo.setUserRole(studentBo.getUserRole());
		
		int count=dao.editStudent(vo);
		

		if(count>0)
		{
			LoginVo loginvo=new LoginVo();
		
			vo.setStudId(count);
			
			loginvo=dao.getloginId(vo);
			if(loginvo.getLoginId()>0)
			{
			loginvo.setName(studentBo.getName());
			loginvo.setEmail(studentBo.getEmail());
			loginvo.setPassword(studentBo.getPassword());
			loginvo.setMobile(studentBo.getMobile());
			loginvo.setUserRole(studentBo.getUserRole());
			
			//vo.setStudId(count);
			loginvo.setStudentvo(vo);
			int loginId=dao.editLogin(loginvo);
		
	}
		}
		return count;

	}

	@Override
	public int deleteStudent(int studId1) {
	
		StudentVo vo=new StudentVo();
		vo.setStudId(studId1);
		int count=dao.deleteStudent(vo);
		if(count>0)
		
		{
			LoginVo loginvo=new LoginVo();
			
			vo.setStudId(count);
			
			loginvo=dao.getloginId(vo);
		
			if( loginvo.getLoginId()>0)
			{
				loginvo.setLoginId(loginvo.getLoginId());
				//vo.setStudId(count);
				loginvo.setStudentvo(vo);
				 int loginId= dao.deleteLogin(loginvo);
			}
		}
		
		return count;
	}

	@Override
	public StudentBo loginStudent(String email, String password) {
		
	      StudentBo studentBo=new StudentBo();
	      StudentVo vo=new StudentVo();
	      
	      vo=dao.loginStudent(email,password);
	      if(null!=vo)
	      {
	    	  studentBo.setStudId(vo.getStudId());
	    	  studentBo.setEmail(vo.getEmail());
	    	  studentBo.setPassword(vo.getPassword());
	      }
		return studentBo;
	}

	@Override
	public StudentBo login(String email, String password) {
		
		  StudentBo studentBo=new StudentBo();
	      StudentVo vo=new StudentVo();
	      
	      vo=dao.login(email,password);
	      if(null!=vo)
	      {
	    	  studentBo.setStudId(vo.getStudId());
	    	  studentBo.setName(vo.getName());
	    	  studentBo.setEmail(vo.getEmail());
	    	  studentBo.setPassword(vo.getPassword());
	    	  studentBo.setMobile(vo.getMobile());
	    	  studentBo.setUserRole(vo.getUserRole());
	      }
		return studentBo;
	}

	

}
