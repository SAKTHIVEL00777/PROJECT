package com.inheritance.hybrid;

public class Human {

	public static void main(String[] args) {
		Son2 s2=new Son2();
		s2.mobile();
		s2.car();
		s2.property();
		System.out.println("===============");
		
		Son1 s1=new Son1();
		s1.bike();
		s1.car();
		s1.property();
		System.out.println("===============");
		
		Father f=new Father();
		f.car();
		f.property();
		System.out.println("===============");
		
		GrandFather gf=new GrandFather();
		gf.property();
	}

}
