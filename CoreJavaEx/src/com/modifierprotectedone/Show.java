package com.modifierprotectedone;

import com.modifierprotected.ProtectedModifier;

public class Show extends ProtectedModifier {

	public static void main(String[] args) {
   
		Show ss=new Show();
		
		System.out.println(ss.salary);
		
		int sum=ss.add(22, 7);
		System.out.println(sum);
		
	}

}
