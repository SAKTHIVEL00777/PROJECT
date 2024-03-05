package com.exception.unchecked;

public class NestedTry {

	public static void main(String[] args) {
                                        
		                                      //NestedTry Exception
		String val=null;
		int x=0;
		try {
			x=10/2;
			System.out.println(x);
			
			try {
				System.out.println(val.length());
			} catch (Exception e) {
				System.out.println(e);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
