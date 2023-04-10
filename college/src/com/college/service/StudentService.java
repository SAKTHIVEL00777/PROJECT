package com.college.service;

import java.util.List;

import com.college.bo.StudentBo;

public interface StudentService {

	int createStudent(StudentBo studentBo);

	List<StudentBo> viewList();

	StudentBo editStudent(int studId1);

	int editStudent(StudentBo studentBo);

	int deleteStudent(int studId1);

	StudentBo loginStudent(String email, String password);

	StudentBo login(String email, String password);

	

}
