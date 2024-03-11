package com.collection;

import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<>();
		
		list.add("JAVA");
		list.add("c");
		list.add("c++");
		list.add("c");
		list.add("5");
		list.add(null);
		list.add(null);
		list.add("true");
		
		System.out.println("FIRST LIST:"+ list);
		
		ArrayList<String> ll=new ArrayList<>();
		  ll.add("A");
		  ll.add("B"); 
		  list.addAll(ll);
		  System.out.println("SECOND LIST:"+ list);
		  
		 list.set(3, "PYTHON");
		 list.remove(6);
		 System.out.println(list);

		 System.out.println("SIZE:"+ list.size());
		 System.out.println("INDEX:"+ list.indexOf("5"));
		 System.out.println("LAST INDEX:"+ list.lastIndexOf(null));
		 System.out.println("CONTAINS:"+ list.contains("c"));
		 System.out.println("CONTAINS ALL:"+ list.containsAll(list));
		 System.out.println(list.isEmpty());
		 System.out.println("GET:"+ list.get(2));
		 System.out.println("CLONE:"+ list.clone());
		 System.out.println("RETAIN ALL:"+ list.retainAll(list)); ;
		 System.out.println("REMOVE ALL:"+ list.removeAll(list)); 
		 
		 ll.clear();
		 System.out.println("CLEAR:"+ ll);
		 
		
	}

}
