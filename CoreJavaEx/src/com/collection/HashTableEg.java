package com.collection;

import java.util.Hashtable;

public class HashTableEg {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht=new Hashtable<>();
		
		ht.put(101, "Raja");
		ht.put(102, "Ram");
		ht.put(103, "Ragu");
		ht.put(103, "Ram");
		//ht.put(104,null);
		System.out.println("Hashtable:"+ ht);
		
		System.out.println(ht.entrySet());
		System.out.println(ht.getOrDefault(100, "Raj"));
		System.out.println(ht.getOrDefault(103, ""));
		ht.putIfAbsent(104, "Rajkumar");
		System.out.println(ht);
		ht.putIfAbsent(102, "Ranjith");
		System.out.println(ht);
		ht.replace(103, "Rahul");
		System.out.println(ht);
	}

}
