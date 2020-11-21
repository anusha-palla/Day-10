package com.src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		//FileWriter fr=new FileWriter("some.Ex");
		p.setProperty("abc", "anu");
		p.setProperty("abc1", "anu1");
		p.store(new FileWriter("Some.Properties"),"general");
		
		System.out.println("file Created");

	}

}
