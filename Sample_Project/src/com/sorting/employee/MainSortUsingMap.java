package com.sorting.employee;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainSortUsingMap {

	public static void main(String[] args) {
		
		
		Employee e1=new Employee("rocky", 101, 5000.00,new Date(2015-1900,01,05));
		Employee e2=new Employee("pulu", 100, 50000.00,new Date(2017-1900,03,12));
		Employee e3=new Employee("babul", 201, 15000.00,new Date(2018-1900,02,11));
		Employee e4=new Employee("ranjan", 200, 1000.00,new Date(2012-1900,01,12));
		
		
		Map<Employee ,String> emp_entry=new TreeMap<Employee,String>();
		  emp_entry.put(e1, "Emp1_data");
		  emp_entry.put(e2, "Emp2_data");
		  emp_entry.put(e3, "Emp3_data");
		  emp_entry.put(e4, "Emp4_data");
		  
		  Set<Map.Entry<Employee,String>> entry_all=emp_entry.entrySet();
		  
		  for(Map.Entry<Employee, String> entry : entry_all){
	            System.out.println(entry.getKey() + " ==> " + entry.getValue());
	        }
		  
		  
	}

}
