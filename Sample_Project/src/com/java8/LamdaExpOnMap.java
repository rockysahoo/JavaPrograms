package com.java8;

import java.util.HashMap;
import java.util.Map;

public class LamdaExpOnMap {

	public static void main(String[] args) {

		// easiest way to loop the Map.
		Map<Integer, String> customers = new HashMap<>();
		customers.put(1, "Jhon");
		customers.put(2, "Smith");
		customers.put(3, "Sally");

		System.out.println("Using foreach in Java 8");
		
		// lambda
		//format ,map.forEach((Object, Object) -> System.out.println("Key : " + Object o + ", Value : " + Object o)

		customers.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

		customers.forEach((id, name) -> {
			System.out.println("Key : " + id + " value : " + name);
		});

		// If you want to filter some data while looping this is one of best way to do
		// that.
		Map<Integer, String> customers2 = new HashMap<>();
		customers2.put(1, "Jhon");
		customers2.put(2, "Smith");
		customers2.put(3, "Sally");

		System.out.println("---------- customers2 --------- ");
		customers.entrySet()
				.stream()
				.forEach(e -> System.out.println("Key : " + e.getKey() + " value : " + e.getValue()));

		// Using entrySet()
		Map<Integer, String> customers3 = new HashMap<>();
		customers3.put(1, "Jhon");
		customers3.put(2, "Smith");
		customers3.put(3, "Sally");

		for (Map.Entry<Integer, String> entry : customers.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
		}

		// Using keySet()
		Map<Integer, String> customers4 = new HashMap<>();
		customers4.put(1, "Jhon");
		customers4.put(2, "Smith");
		customers4.put(3, "Sally");
		customers4.put(null, "NA");
		
		for (Integer key : customers.keySet()) {
			System.out.println("Key : " + key + " value : " + customers.get(key));
		}

		
		// If we do not want to print the null key
		customers4.forEach(
		          (k, v) -> {
		              // yes, we can put logic here
		              if (k != null){
		                  System.out.println("Key : " + k + ", Value : " + v);
		              }
		          }
		      );
		
	}

}
