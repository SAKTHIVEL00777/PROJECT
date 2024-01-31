package com.encapsulation;

public class Employee {

	private int empId;   //--->Declaration
	private String name;
	private String city;
	
	public int getempId(){    //--->//getter method --read only access
		return empId;
	}
	public void setempId(int empId){   //--->//setter- write only access
		this.empId=empId;
	}
	public String getName(){
		
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getCity(){
		return city;
		
	}
	public void setCity(String city){
		this.city=city;
	}
	}
