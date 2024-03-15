package com.collection;

import java.util.Vector;

public class VectorEg {

	public static void main(String[] args) {

		Vector<String> music=new Vector<>();
		music.add("ARR");
		music.addElement("GVP");
		music.addElement("YUVAN");
		music.addElement("ANIRUDH");
		music.addElement("YUVAN");
		music.addElement(null);
		music.addElement(null);
		
		System.out.println("Vector List:"+ music);
		
		System.out.println("SIZE:"+ music.size());
		System.out.println("CAPACITY:"+ music.capacity());
		System.out.println("FIRST ELEMENT:"+ music.firstElement());
		System.out.println("LAST ELEMENT:"+ music.lastElement());
		System.out.println(music.elementAt(2));
	}

}
