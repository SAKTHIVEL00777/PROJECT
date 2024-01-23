package com.inheritance.multilevel;

public class Ipad extends Laptop {
	
	int year=1995;
	
	public void allShow(){
		System.out.println("LENOVO IPAD");
	}

	public static void main(String[] args) {

		Ipad ob=new Ipad();
		
		System.out.println("FATHER:"+ ob.father);
		System.out.println("COMPANY:"+ ob.company);
		System.out.println("YEAR:"+ ob.year);
		
		ob.display();
		ob.show();
		ob.allShow();
	}

}
