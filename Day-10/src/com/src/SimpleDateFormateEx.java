package com.src;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateEx {

	public static void main(String[] args) throws IllegalArgumentException{
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat();
		String str=s.format(d);
		System.out.println(str);
		System.out.println(s.toPattern());
		System.out.println(s.toLocalizedPattern());
		System.out.println(str.equals(d));
		System.out.println(s.getDateFormatSymbols());
	System.out.println( s.get2DigitYearStart());
	 s.applyLocalizedPattern("DD");
	//System.out.println(s);

	}

}
