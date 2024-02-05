package com.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading mo=new MethodOverloading();
		mo.add();
		mo.add(5, 7);
		add(10,"MESSI");
	}
	public void add(){
		System.out.println("COMPILETIME POLYMORPHISM");
		System.out.println("==================");
	}

	public void add(int x,int y){
		
		System.out.println("Value of X:"+ x);
		System.out.println("Value of Y:"+ y);
		System.out.println("==================");
	}
	public static void add(int no,String name){
		System.out.println("NO:"+ no);
		System.out.println("NAME:"+ name);
		//System.out.println(no+" "+name);
		
	}
}
