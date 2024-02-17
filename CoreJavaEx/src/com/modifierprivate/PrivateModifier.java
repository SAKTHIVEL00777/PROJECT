package com.modifierprivate;

public class PrivateModifier {
	
	private int empId=1;
	
	private void empName(){
		System.out.println("GURU");
	}
	public static void main(String[] args) {

		PrivateModifier pm=new PrivateModifier();
		
		System.out.println(pm.empId);
		pm.empName();
		
	}

}
