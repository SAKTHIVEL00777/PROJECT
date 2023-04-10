package com.college.vo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class LoginVo {

	@Id
	@GeneratedValue
	
	private int loginId;
	private String name;
	private String email;
	private String password;
	private long mobile;
	private String userRole;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="studId")
	private StudentVo studentvo;
	
	public StudentVo getStudentvo() {
		return studentvo;
	}
	public void setStudentvo(StudentVo studentvo) {
		this.studentvo = studentvo;
	}
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
}
