package com.exception.unchecked;

public class StringIndexEx {

	public static void main(String[] args) {
 
		                                        //StringIndexOutOfBoundsException
		String word="BEAUTY";
		char ch= word.charAt(3);
		System.out.println(ch);
		
		try {
			
			ch=word.charAt(7);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


