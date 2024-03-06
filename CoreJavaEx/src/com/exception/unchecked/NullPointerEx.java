package com.exception.unchecked;

public class NullPointerEx {

	public static void main(String[] args) {
		
		              
		                                          // NullPointerException

		String val=null;
		
		System.out.println("NULLPOINTER METHOD");
		String name="MESSI";
		    int ref=name.length();
		    System.out.println(ref);
		    
		
		try {
			System.out.println(val.length());
			
		} catch (Exception e) {
			System.out.println(e);
		}
			
		
	}

}
