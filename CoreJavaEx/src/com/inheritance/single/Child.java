package com.inheritance.single;

public class Child extends Parent {

	public static void main(String[] args) {
      
		Child c=new Child();
		
		 System.out.println("MOBILENAME:"+ c.mobname);
		 System.out.println("PRICE:"+ c.price);
		 c.mobile();
		 c.lava();

	}
	public void lava(){
		
		System.out.println("LAVA MOBILE AVALIABLE");
	}

}
