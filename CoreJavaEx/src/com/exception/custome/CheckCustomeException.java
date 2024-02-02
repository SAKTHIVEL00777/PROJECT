package com.exception.custome;

public class CheckCustomeException {
	
	public static void checkAge(int age)throws AgeException{
		
		if(age<18){
			throw new AgeException("NOT ELIGIBLE FOR VOTE:");
		}
		else{
			System.out.println("ELIGIBLE FOR VOTE");
		}
		
	}

	public static void main(String[] args) {

		try {
			//calling the method
			checkAge(17);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("CUSTOME EXCEPTION METHOD:");

	}

}
