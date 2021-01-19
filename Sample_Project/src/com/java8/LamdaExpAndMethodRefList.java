package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LamdaExpAndMethodRefList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// lambda
		list.forEach(x -> System.out.println(x));
		
		System.out.println("---------");
		
		// method reference
		list.forEach(System.out::println);

		
		 // filter null value
	      list.stream()
	              .filter(Objects::nonNull)
	              .forEach(System.out::println);

		
	}

}
