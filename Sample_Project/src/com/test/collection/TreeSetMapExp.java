package com.test.collection;

import java.util.TreeSet;

public class TreeSetMapExp {

	public static void main(String[] args) {
		
		
		TreeSet see=new TreeSet();
		//see.add(null);
		//see.add("abc");
		//see.add(1);
		//System.out.println(see);
		
		
		
		String s1=new String("rocky");
		String s2=new String("rocky");
		
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1=new StringBuffer("R");
		StringBuffer sb2=new StringBuffer("R");
		StringBuffer sb3=sb1;
		
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.equals(sb3));
		

	}

}
