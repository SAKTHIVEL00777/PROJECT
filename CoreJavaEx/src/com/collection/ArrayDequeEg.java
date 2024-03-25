package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEg {

	public static void main(String[] args) {

		Deque<Integer> de=new ArrayDeque<>();
		
		de.add(2);
		de.add(4);
		de.add(6);
		de.add(8);
		de.add(4);
		//de.add(null);
		
		System.out.println("ArrayDeque List:"+ de);
		
		de.pop();      System.out.println("Pop List:"+ de);
		
		de.remove();   System.out.println("Remove List:"+ de);
	}

}
