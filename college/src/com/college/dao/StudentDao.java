package com.college.dao;

import java.util.List;

import com.college.vo.LoginVo;
import com.college.vo.StudentVo;

public interface StudentDao {

	int createStudent(StudentVo vo);

	int studLogin(LoginVo loginvo);

	List<LoginVo> viewList();

	StudentVo editStudent(int studId1);

	int editStudent(StudentVo vo);

	int editLogin(LoginVo loginvo);
	
	LoginVo getloginId(StudentVo vo);

	int deleteStudent(StudentVo vo);

	int deleteLogin(LoginVo loginvo);

	StudentVo loginStudent(String email, String password);

	StudentVo login(String email, String password);

	

	



	



}
