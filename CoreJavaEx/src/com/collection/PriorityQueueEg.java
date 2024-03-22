package com.collection;

import java.util.PriorityQueue;

public class PriorityQueueEg {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(1);
		pq.add(3);
		pq.add(2);
		pq.add(6);
		pq.add(5);
		pq.add(3);
		//pq.add(null);
		
		System.out.println("PriorityQueue List:"+ pq);
		
		pq.remove(6);  System.out.println("Remove List:"+ pq);
		
		pq.peek();    System.out.println(pq);  
		
		pq.poll();    System.out.println(pq);  //-->first element remove
	}

}
