package com.exception.unchecked;

public class ArithmeticEx {

	public static void main(String[] args) {

		int x=0;
		
		System.out.println("ARITHMETIC METHOD");
		String city="chennai";
		System.out.println(city);
		
		try{
			
		x=10/0;
		
		}catch (Exception e) {
			System.out.println(e);
		}
		x=21/3;
		System.out.println(x);
		
		
	}

}
