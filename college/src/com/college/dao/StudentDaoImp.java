package com.college.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.vo.LoginVo;
import com.college.vo.StudentVo;

@Repository
public class StudentDaoImp implements StudentDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public int createStudent(StudentVo vo) {
	 int count=0;
		try {
			Session s=sf.getCurrentSession();
			count=(int) s.save(vo);
		} 
		catch (Exception e) {
		System.out.println(e);
		}
		return count;
	}

	@Override
	public int studLogin(LoginVo loginvo) {
		int loginId=0;
		try {
			Session s=sf.getCurrentSession();
			loginId=(int) s.save(loginvo);
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return loginId;
	}

	@Override
	public List<LoginVo> viewList() {
		
		List<LoginVo> listvo=new ArrayList<LoginVo>();
		try {
			
			Session s=sf.getCurrentSession();
			Criteria cr=s.createCriteria(LoginVo.class);
			listvo=cr.list();
		}
		catch (Exception e)
		{
		    System.out.println(e);
		}
		return listvo;
	}

	@Override
	public StudentVo editStudent(int studId1) {
		StudentVo vo=new StudentVo();
		try {
			Session s=sf.getCurrentSession();
			Criteria cr=s.createCriteria(StudentVo.class);
			cr.add(Restrictions.eq("studId",studId1));
			vo=(StudentVo) cr.uniqueResult();
			
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return vo;
	}

	@Override
	public int editStudent(StudentVo vo) {
		int count=0;
		try {
			Session s=sf.getCurrentSession();
			
			s.update(vo);
			count=vo.getStudId();
		} 
		catch (Exception e) {
			
		}
		return count;
	}

	@Override
	public int editLogin(LoginVo loginvo) {
		int loginId=0;
		try {
			Session s=sf.getCurrentSession();
			s.update(loginvo);
			loginId=loginvo.getLoginId();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return loginId;
	}
	@Override
	public LoginVo getloginId(StudentVo vo) {
		LoginVo loginvo=new LoginVo();
	try {
			
			Session s=sf.getCurrentSession();
			Criteria cr=s.createCriteria(LoginVo.class);
			cr.add(Restrictions.eq("studentvo",vo));
			loginvo=(LoginVo) cr.uniqueResult();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return loginvo;
		
	}
	
	@Override
	public int deleteStudent(StudentVo vo) {
	
		int count=0;
		try {
			
			Session s=sf.getCurrentSession();
				s.delete(vo);
				count=vo.getStudId();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return count;
	}


	@Override
	public int deleteLogin(LoginVo loginvo) {
		int loginId=0;
		try {
			Session s=sf.getCurrentSession();
			s.delete(loginvo);
			loginId=loginvo.getLoginId();
		}
		catch (Exception e) {
			
		}
		return loginId;
	}

	@Override
	public StudentVo loginStudent(String email, String password) {
	     StudentVo vo=new StudentVo();
	     try {
			
	    	 Session s=sf.getCurrentSession();
	    	 Criteria cr=s.createCriteria(StudentVo.class);
	    	 cr.add(Restrictions.eq("email",email));
	    	 cr.add(Restrictions.eq("password",password));
	    	 
	    	 vo=(StudentVo) cr.uniqueResult();
		}
	     catch (Exception e) {
			System.out.println(e);
		}
		return vo;
	}

	@Override
	public StudentVo login(String email, String password) {
		 StudentVo vo=new StudentVo();
	     try {
			
	    	 Session s=sf.getCurrentSession();
	    	 Criteria cr=s.createCriteria(StudentVo.class);
	    	 cr.add(Restrictions.eq("email",email));
	    	 cr.add(Restrictions.eq("password",password));
	    	 
	    	 vo=(StudentVo) cr.uniqueResult();
		}
	     catch (Exception e) {
			System.out.println(e);
		}
		return vo;
	}

	
	
}
