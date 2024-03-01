package com.exception.unchecked;

public class DemoThrow {
	
	public static void vote(int age){
		
		
		                              //ThrowException
		if(age>15){
			
			throw new ArithmeticException();
			
		}else{
			
			System.out.println("CONDITION TRUE BY ELSE BLOCK CALL......");
		}
		
		
	}

	public static void main(String[] args) {
  
		vote(17);
	}

}
