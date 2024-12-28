package com.javaInterview.dataStructure;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("carrot");
		pq.add("banana");
		pq.add("strawberry");
		pq.add("apple");
		pq.add("blueberry");
		pq.add("blueberry");
		pq.add("blackberry");
		pq.add("carrot");

		System.out.println("Priority Queue = "+pq);
		
		System.out.println("First Element in queue = "+pq.poll()); //gives the first element and removes it from PQ
		
		System.out.println("Priority Queue after poll= "+pq);
		
		System.out.println("First Element in queue = "+pq.peek());

		System.out.println("Priority Queue after peek= "+pq);
	}
}
