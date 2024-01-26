package com.inheritance.multiple;

public class Vechical implements TwoWheelar,FourWheelar {

	public static void main(String[] args) {
		
		Vechical ve=new Vechical();
		ve.bike();
		ve.xl();
		ve.cycle();
		System.out.println("==============");
		ve.bus();
		ve.car();
		ve.lorry();
	}

	@Override
	public void bus() {
		
		System.out.println("STAR BUS");
	}

	@Override
	public void car() {
		
		System.out.println("BMW CAR");
	}

	@Override
	public void lorry() {
		
		System.out.println("EICHER");
		
	}

	@Override
	public void bike() {
	
		System.out.println("PLUSAR");
		
	}

	@Override
	public void xl() {
		System.out.println("XL 100");
		
	}

	@Override
	public void cycle() {
		System.out.println("NORMAL CYCLE");
		
	}

}
