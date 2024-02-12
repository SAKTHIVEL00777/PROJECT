package com.modifierdefault;

public class DefaultModifier {

	String staffName;
	
	void staff(int staffId,String city){
		System.out.println(staffId+" "+city);
	}
	
	public static void main(String[] args) {
		
		DefaultModifier dm=new DefaultModifier();
		
		System.out.println(dm.staffName);
		dm.staff(2, "SALEM");
	}

}
