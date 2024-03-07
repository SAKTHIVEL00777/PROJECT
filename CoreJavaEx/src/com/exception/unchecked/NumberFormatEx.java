package com.exception.unchecked;

public class NumberFormatEx {

	public static void main(String[] args) {

		                                           //NumberFormatException
		String regId="111";
		String state="TAMILNADU";
		
		int Id=Integer.parseInt(regId);
		System.out.println("ID:"+ Id);
		
		try {
			int val=Integer.parseInt(state);
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		String no="9876545600";
		long mobile=Long.parseLong(no);
		System.out.println("MOBILE NO:"+ mobile);
	}

}
