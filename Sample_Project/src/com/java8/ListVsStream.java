package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListVsStream {

	
	public static void main(String[] args) {

        List<String> list = Arrays.asList("abc", "java", "python");
        Stream<String> stream = Stream.of("abc", "java", "python");

        
        //Streams Work -> A stream represents a sequence of elements and 
        //supports different kind of operations to perform computations upon those elements:
        
        List<String> myList = Arrays.asList("a1", "a2", "a3", "a4", "b1", "b2", "c1", "c3", "c2");

        myList.stream()
        	.filter(s -> s.startsWith("c"))
        	.map(String::toUpperCase)
        	.sorted()
        	.forEach(System.out::println);
        
        
        //Loop a Map with forEach and lambda expression.
        Map<String, Integer> items = new HashMap<>();

        items.put("A", 10);
        items.put("B", 10);
        items.put("C", 10);
        items.put("D", 70);
        items.put("E", 100);

        // stream() and filter()
        items.stream()
        	.filter((k, v) -> v > 0 && v < 50)
        	.forEach((k, v)->{
        		System.out.println("Item : " + k + " Count : " + v);
        	});
        
        
        
        List<String> studentName = Arrays.asList("hector", "hana", "stone");

        List<String> result = studentName.stream()	// Convert list to stream
        	.filter(name -> !"hana".equals(name))	// remove "hana" hana from list
        	.collect(Collectors.toList());			// collect the output and convert Stream to List

        // print using method reference
        result.forEach(System.out::println);
        
        
	}
        
}
