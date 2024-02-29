package com.exception.unchecked;

public class ArrayIndexEx {

	public static void main(String[] args) {
	
		String[] ar=new String[3];
		
		try {
			ar[0]="CHEES";
			ar[1]="VOLLY BALL";
			ar[2]="CRICKET";
			ar[3]="FOOT BALL";
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
			System.out.println("THIS STATEMENT IS FINALLY.........");
		}
		
		System.out.println(ar[2]);
	}

}
