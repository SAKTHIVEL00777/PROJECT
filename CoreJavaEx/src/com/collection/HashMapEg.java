package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

	public static void main(String[] args) {

		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "Ajay");
		map.put(3, "Ahkash");
		map.put(5, "Ashok");
		map.put(5, "Ahkash");
		map.put(null, null);
		map.put(null, "Avinash");

		
		System.out.println(map);
	}

}
