package com.test;

import java.util.HashMap;
import java.util.*;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<Integer,Object> map=new TreeMap<>();
		map.put(1, "sam");
		map.put(3, "manas");
		//map.put(null, "rocky"); //null kay will be always on top ,coz hashcode of null is zero
		map.put(2, null);
		map.put(3, null);
		map.put(2, "babul");
		
		System.out.println("map --> "+map);

	/*	System.out.println("map key--> "+map.keySet()); //Set key=map.keySet();

		System.out.println("map values--> "+map.values());//Collections values=map.values();


		Set<Map.Entry> entry=map.entrySet();

		for(Map.Entry iter:entry) {

			System.out.println(iter.getKey()+"  --> "+iter.getValue());
		}*/
		
		
	}

}
