package com.src;

import java.awt.List;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lc=new ArrayList();
		lc.add(12);
		lc.add(14);
		lc.add(11);
		lc.add(10);
		System.out.println(lc);
		Collections.addAll(lc, 34,12,13);
		System.out.println(lc);
		System.out.println(Collections.frequency(lc, 12));
		System.out.println(Collections.binarySearch(lc, 10));
		System.out.println(Collections.checkedList(lc,Integer.class));
		 Deque<String> dque = new ArrayDeque<String>(lc);  
		  Queue<String> q = Collections.asLifoQueue(dque);     
		  System.out.println(q);
		
		   Queue<Integer> queue = new PriorityQueue<Integer>(lc);  
		   System.out.println(Collections.checkedQueue(queue,Integer.class));
		   Collections.rotate(lc, 3);
		   System.out.println(lc);
		   
		

	}

}
