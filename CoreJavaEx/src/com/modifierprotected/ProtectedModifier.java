package com.modifierprotected;

public class ProtectedModifier {
	
	protected float salary=10500.00f;
	
	protected int add(int x,int y){
        return x+y;
	}

	public static void main(String[] args) {

		ProtectedModifier pm=new ProtectedModifier();
		
		System.out.println(pm.salary);
		
		int add=pm.add(7, 6);
		System.out.println(add);
		
	}

}
