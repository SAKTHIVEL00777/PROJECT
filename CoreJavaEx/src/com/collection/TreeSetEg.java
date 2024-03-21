package com.collection;

import java.util.TreeSet;

public class TreeSetEg {

	public static void main(String[] args) {

		TreeSet<String> ts=new TreeSet<>();
		ts.add("5");
		ts.add("7");
		ts.add("2");
		ts.add("1");
		//ts.add("2");    //--->duplicate value not allow
		
		System.out.println("TreeSet List:"+ ts);
		
		TreeSet<String> ts1=new TreeSet<>();
		ts1.add("vivek");
		ts1.add("karan");
		ts1.add("ruban");
		//ts1.add(null);
		
		
		System.out.println("2nd TreeSet List:"+ ts1);
	}

}
