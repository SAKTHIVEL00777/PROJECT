package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEg {

	public static void main(String[] args) {

		LinkedList<String> actor=new LinkedList<>();
		actor.add("MADDY");
		actor.add("SURYA");
		actor.add("KARTHICK");
		actor.add("AJITH");
		actor.add("MADDY");
		actor.add(null);
		actor.add(null);
		
		System.out.println("LINKED LIST:"+ actor);
		
		List<String> list=new LinkedList<>();   //--->upcasting
		list.add("WELCOME");
	    list.add("THANK YOU");
	    
	    Iterator<String> ite=list.iterator();
	    System.out.println(ite.hasNext());
	    while(ite.hasNext()){
	    	System.out.println(ite.next());
	    }
	}

}
