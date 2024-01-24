package com.inheritance.hierarchical;

public class India {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricket cr=new Cricket();   //child-> 1
		cr.match();
		cr.allSports();
		System.out.println("======================");
		
		Football fb=new Football();  //child->2
		fb.goal();
		fb.allSports();
		System.out.println("======================");
		
		Sports sp=new Sports();     //parent
		System.out.println("GAMES:"+ sp.game);
		sp.allSports();

	}

}
