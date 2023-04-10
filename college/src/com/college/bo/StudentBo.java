package com.college.bo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class StudentBo {

	private int studId;
	
	@NotEmpty
	@Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Name Should be a Character")
	@Size(min = 3, max = 20)
	private String name;
	
	@NotEmpty
	@Pattern(regexp = ".+@.+\\.[a-z]+", message = "Invalid Email Format")
	@Email
	private String email;
	
	@NotNull
	@Size(min = 4, max = 8,message = "Password Size Must be 4 to 8")
	private String password;
	
	@NotNull
	@Range(min = 1111111111,message = "Mobile Number must be a 10 Digits")
	private long mobile;
	
	@NotNull
	@NotEmpty
	private String userRole;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
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
