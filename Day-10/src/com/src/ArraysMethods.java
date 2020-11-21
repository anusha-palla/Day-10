package com.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(44);
		l.add(78);
		l.add(12);
		l.add(56);
		Object[] i=l.toArray();
		for(Object s:i)
		{
			System.out.println(s);
		}
		System.out.println(Arrays.asList(i));
		
		System.out.println(Arrays.binarySearch(i,1,4,12));
		System.out.println(Arrays.toString(Arrays.copyOf(i,10)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(i,1,4)));
		//System.out.println(Arrays.fill(i, 1,3,14));
		System.out.println(Arrays.deepHashCode(i));
		System.out.println(Arrays.hashCode(i));
		Arrays.sort(i);
		System.out.println(i);
		System.out.println(Arrays.toString(i));
		Stream<Object> s1=Arrays.stream(i);
		Stream<Object> s2=Arrays.stream(i,1,3);
		s1.forEach(str -> System.out.print(str+" "));
		s2.forEach(str -> System.out.print(str+" "));
		
		
		
		
		
		
		

	}

}
