package com.src;

import java.util.Date;

public class DateClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d.getClass());
		System.out.println(d.hashCode());
		System.out.println(d.getTime());
		d.setTime(1123);
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.toInstant());
		Date d1=new Date(10,11,2020);
		Date d2=new Date(12,12,2020);
		System.out.println(d1.after(d2));
		System.out.println(d1.before(d2));
		Object d3=d1.clone();
		System.out.println(d3.toString());
		System.out.println(d1.compareTo(d2));
		

	}

}
