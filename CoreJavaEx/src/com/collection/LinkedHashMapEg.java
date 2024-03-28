package com.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapEg {

	public static void main(String[] args) {

		LinkedHashMap<String, String> lhm=new LinkedHashMap<>();
		lhm.put("A", "Kavin");
		lhm.put("B", "Kumar");
		lhm.put("C", "Kumar");
		lhm.put("D", "karthick");
		lhm.put("D", null);
		lhm.put(null,null);
		
		System.out.println("LinkedHashMap List:"+ lhm);
		
	}

}
