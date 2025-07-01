package com.Queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;

import com.List.Employee;

public class Launch {

	public static void main(String[] args) {
	/*	PriorityQueue<Integer> pq=new PriorityQueue<Integer>(); //This is using Min Heap
		//PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());//Then here order now this will uses MAX HEAP
		//PriorityQueue had been designed to be Generic (bcz Data comparison & Sorting so same type data);
		
		pq.add(123); //Compare ? ==> compareTo(); ==> Comparable internally implements
		pq.add(8);
		pq.add(1400);
		pq.add(400);
		pq.add(300);
		pq.add(5);
		pq.add(556);
		pq.add(900);
		pq.add(700);
		
		System.out.println(pq);
		pq.poll(); //Remove Lowest element
		
		System.out.println(pq); 
		
		
		
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		pq.add(new Employee(0, null, null, 0, null, null));//But here in Employee Object not implements comparable so here not present compareTo method so not allowed; 
		// So here Exception occurs 
		 Exception in thread "main" java.lang.ClassCastException: class com.List.Employee cannot be cast to class
		 *  java.lang.Comparable (com.List.Employee is in unnamed module of loader 'app';
		 *   java.lang.Comparable is in module java.base of loader 'bootstrap')
		 
		System.out.println(pq);
		
		*/
		
		Deque<Object> dq=new ArrayDeque<Object>();
		dq.addLast("raju");
		dq.addFirst("kaju");
		
		dq.addLast("xraju");
		dq.addLast("xkaju");
		
		System.out.println(dq);
//		dq.clear();
		dq.pollFirst();
		dq.pollLast();
	
		//If our deque is empty then we call removeFirst it gives Exception 
		//But in poll not giving exception
//		dq.removeFirst();
//		dq.removeLast();

		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq);
		
		
	}

}
