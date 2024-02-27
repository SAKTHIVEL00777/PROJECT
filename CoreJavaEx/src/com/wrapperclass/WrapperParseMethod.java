package com.wrapperclass;

public class WrapperParseMethod {

	public static void main(String[] args) {

		String age="22";
		Integer val=Integer. valueOf(age);   //--->1st way
	    System.out.println(val);
	    System.out.println("================");
	    
	    System.out.println("PARSE METHOD ........");
	    String studId="07";
	    int emp=Integer.parseInt(studId);   //--->2nd way
	    System.out.println(emp);
	    
	    String num="9856732156";
	    long mobile=Long.parseLong(num);
	    System.out.println(mobile);
	    
	   String bo="TRUE";
	   boolean boo=Boolean.parseBoolean(bo);
	   System.out.println(boo);
	   
	   String no="31556";
	   short sh=Short.parseShort(no);
	   System.out.println(sh);
	}

}
