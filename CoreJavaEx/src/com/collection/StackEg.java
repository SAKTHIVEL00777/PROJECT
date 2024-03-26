package com.collection;

import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {

		Stack<Integer> sta=new Stack<>();
		
		sta.add(1);
		sta.add(2);
		sta.add(3);
		sta.add(4);
		sta.add(5);
		sta.add(3);
		sta.add(null);
		sta.add(null);

		System.out.println("Stack List:"+ sta);
		
		sta.pop();    System.out.println("Pop List:"+ sta);
		
		sta.push(6);  System.out.println("Push List:"+ sta);
		
	}

}
