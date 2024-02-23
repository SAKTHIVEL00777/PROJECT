package com.modifierpublicone;

import com.modifierpublic.PublicModifier;

public class Display extends PublicModifier {

	public static void main(String[] args) {

		PublicModifier pm=new PublicModifier();
		
		System.out.println(pm.custId);
		
		pm.show();
		
		
		
	}

}
