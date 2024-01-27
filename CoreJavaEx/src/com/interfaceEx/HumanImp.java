package com.interfaceEx;

public class HumanImp implements Human{

	public static void main(String[] args) {
		
		String name="MSD";
		int no=7;
		String nickName="Captatin Cool";
		
	HumanImp imp=new HumanImp();
	System.out.println(name);
	System.out.println(no);
	System.out.println(nickName);
	System.out.println("=======================");
	imp.walk();
	imp.sleep();
	}

	@Override
	public void walk() {
		
		System.out.println("MORNING 5AM TO 6AM WALKING ");
		
	}

	@Override
	public void sleep() {
	
		System.out.println("DAILY NIGHT 8 HOURS SLEEPING");
	}

}
