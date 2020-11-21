package com.src;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class MethodsSortedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap hm=new TreeMap<>();
		hm.put(12,"sk");
		hm.put(13,"pk");
		hm.put(11,"ck");
		hm.put(10,"dk");
		System.out.println(hm.firstKey());
		System.out.println(hm.tailMap(11));
		System.out.println(hm.headMap(13));
		System.out.println(hm.subMap(10,12));
		
		NavigableMap hm1=new TreeMap<>(hm);
	System.out.println(hm1.descendingMap());
	System.out.println(hm1.headMap(10,true));
	System.out.println(hm1.subMap(11,true,13,true));
		

	}

}
