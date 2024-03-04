package com.exception.unchecked;

public class DemoThrows {
	
	public static int div(int a,int b) throws ArithmeticException{
		
		int no=a/b;
		return no;
	}

	public static void main(String[] args) {

		                                         //ThrowsException
		try {
			
			System.out.println(div(70,0));
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		System.out.println("DEMO THROWS METHOD...........");
	}

}
