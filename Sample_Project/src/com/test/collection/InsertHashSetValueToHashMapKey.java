package com.test.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InsertHashSetValueToHashMapKey {

	public static void main(String[] args) {
		
		
		
		Set<Integer> entry=new HashSet<>();
		entry.add(10);
		entry.add(4);
		entry.add(10);
		entry.add(6);
		entry.add(100);
		entry.add(90);
		
		System.out.println("Your set here : " +entry);
		
		Map<Integer,Integer> map_entry=new HashMap<>();
		map_entry.put(22222, 11111);
		map_entry.put(6, 100000);
		
		System.out.println("map before set insert : "+map_entry);
		
		addEntry(entry,map_entry);
		System.out.println("map after insert the set object : " +map_entry);

	}

	private static Map<Integer, Integer> addEntry(Set<Integer> entry, Map<Integer, Integer> map_entry) {
		
		int value=1;
		if(entry.size()==0){
			
			
			System.out.println("Your set is empty now");
			return map_entry;
			
		}
		
		{
			for(Integer add_to_mapKey:entry) {
				
				map_entry.put(add_to_mapKey, value);
				value++;
			}
			
		}
		return map_entry;
	}

	

}
