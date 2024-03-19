package com.collection;

import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<>();
		hs.add("Arun");
		hs.add("Arul");
		hs.add("Avinash");
		hs.add("Arul");
		hs.add(null);
		hs.add(null);
				
		System.out.println("HashSet List:"+ hs);
		
		hs.remove("Avinash");  System.out.println("Remove List:"+ hs);
		
		hs.removeAll(hs);    System.out.println(hs);
		
        hs.clear();   System.out.println(hs);
	}

}
