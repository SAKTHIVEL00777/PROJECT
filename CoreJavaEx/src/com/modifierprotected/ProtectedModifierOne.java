package com.modifierprotected;

public class ProtectedModifierOne {

	public static void main(String[] args) {

		ProtectedModifier pm=new ProtectedModifier();
		
		System.out.println(pm.salary);
		
		int val=pm.add(6, 4);
		System.out.println(val);
	}

}
