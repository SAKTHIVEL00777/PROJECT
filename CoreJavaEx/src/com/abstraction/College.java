package com.abstraction;

public class College extends Department {

	public static void main(String[] args) {
		College clg=new College();
		clg.dept();
		clg.cs();
		clg.bca();
		System.out.println("==================");
		
		Department dep=new College();  //--->Upcasting
		
		dep.dept();   	dep.cs();    	dep.bca();
	}
	@Override
	public void cs() {
		System.out.println("BACHOLER OF COMPUTER SCIENCE:");
		
	}

	@Override
	public void bca() {
		System.out.println("BACHOLER OF COMPUTER APPLICATION:");
		
	}

}
