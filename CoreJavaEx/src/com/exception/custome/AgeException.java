package com.exception.custome;

public class AgeException extends Exception {
	
	public AgeException(String str){
		
		//calling constructor of parent exception
		
		super(str);
		
		//super keyword to reffer to immediate parent class object
	}

}
