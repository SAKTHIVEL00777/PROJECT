package com.collection;

import java.util.LinkedHashSet;

public class LinkedHashsetEg {

	public static void main(String[] args) {

		LinkedHashSet<String> Lhs=new LinkedHashSet<>();
		Lhs.add("vicky");
		Lhs.add("guna");
		Lhs.add("gaja");
		Lhs.add("guna");
		Lhs.add(null);
		Lhs.add(null);
		
		System.out.println("LinkedHashSet List:"+ Lhs);
	}

}
