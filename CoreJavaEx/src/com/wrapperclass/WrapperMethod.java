package com.wrapperclass;

public class WrapperMethod {

	public static void main(String[] args) {

		System.out.println("BOXING METHOD");
		int no=13;
		Integer i=Integer.valueOf(no);    //-->valueOf is used for boxing
		System.out.println("INTEGER NO:"+ i);
		
		long ll=9876567875L;
		Long mobile=Long.valueOf(ll);
		System.out.println("MOBILE NO:"+ mobile);
		
		String str="MESSI";                    //--->primitive datatype
		String name=String.valueOf(str);
		System.out.println("NAME:"+ name);
		System.out.println("==================");
		
		System.out.println("UNBOXING METHOD:");
		Boolean b=true;
		boolean b1=b.booleanValue();
		System.out.println(b1);
		
		Integer ii=111;
		int i1=ii.intValue();         //--->unboxing from object to primitive datatype
		System.out.println(i1);   
		
		Short s=8767;
		short s1=s;            //--->auto unboxing
		System.out.println(s1);
		
		Character c='M';
		char cc=c;
		System.out.println(c);
		
		String str1="SACHIN";
		String name1=str1;
		System.out.println(name1);
		
	}

}
