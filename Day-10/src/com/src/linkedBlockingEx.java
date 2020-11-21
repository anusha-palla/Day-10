package com.src;

import java.util.concurrent.LinkedBlockingQueue;

public class linkedBlockingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedBlockingQueue lb=new LinkedBlockingQueue<>();
		lb.add(34);
		lb.add(12);
		lb.add(15);
		lb.add(16);
		lb.add(11);
		System.out.println(lb);
		System.out.println(lb.peek());

	}

}
