package com.polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		
	BlueColor bc=new BlueColor();
	bc.color();
	bc.blue();
	System.out.println("====================");
	GrayColor gc=new GrayColor();
	gc.color();
	gc.gray();
	System.out.println("====================");
	RedColor rc=new RedColor();
	rc.color();
	rc.red();
	}

}
