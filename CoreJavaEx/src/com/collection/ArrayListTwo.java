package com.collection;

import java.util.ArrayList;

public class ArrayListTwo {

	public static void main(String[] args) {

		ArrayList<Integer> list1=new ArrayList<>();
		
		list1.add(3);
		list1.add(5);
		list1.add(7);
		
		System.out.println(list1);
		
		list1.ensureCapacity(10);
		System.out.println(list1.isEmpty());
		
		
		/*int ar[]=new int[2];
		ar[0]=3;
		ar[1]=5;
		ar[2]=7;
		
		System.out.println(ar);
		*/
		
	}

}
