package com.src;

import java.util.ArrayList;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class PriorityBlockingQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityBlockingQueue pb=new PriorityBlockingQueue(10);
	pb.add(2);
	pb.add(4);
	pb.add(3);
	pb.add(6);
	pb.add(7);
	pb.add(8);
	
		System.out.println(pb);
		System.out.println(pb.poll());
		System.out.println(pb.peek());
		System.out.println(pb.remainingCapacity());

		pb.offer(34, 1234, TimeUnit.SECONDS);
		System.out.println(pb);

	}

}
