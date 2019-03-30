package com.sorting.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class MainSortingUsingList {
	
	
		@SuppressWarnings({ "deprecation", "unchecked" })
		public static void main(String[] args) {
			
			
			
			Employee e1=new Employee("rocky", 101, 5000.00,new Date(2015-1900,01,05));
			Employee e2=new Employee("pulu", 501, 50000.00,new Date(2017-1900,03,12));
			Employee e3=new Employee("babul", 201, 15000.00,new Date(2018-1900,02,11));
			Employee e4=new Employee("ranjan", 100, 1000.00,new Date(2012-1900,01,12));
			
			List<Employee> al=new ArrayList<>();
			
			al.add(e1);
			al.add(e2);
			al.add(e3);
			al.add(e4);
			
			
			
			//Sorting based on Date
			Collections.sort(al,new DateComparator1());
			
			//Sorting based on ID
			Collections.sort(al,new IdComparator1());
			
			//It will sort both the properties at a time 
			//Date ,ID ,Name
			System.out.println(al);
				
			}
			
		}



	class DateComparator1 implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			
			Employee ee1=(Employee)o1;
			Employee ee2=(Employee)o2;
			
			Date d1=ee1.Joining_year;
			Date d2=ee2.Joining_year;
			
			return d1.compareTo(d2);
			
		}
			
		
	}
	class IdComparator1 implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			
			Employee ee1=(Employee)o1;
			Employee ee2=(Employee)o2;
			
			Integer i1=ee1.getId();
			Integer i2=ee2.getId();
			
			return i1.compareTo(i2);
			
			
		}
		
		
		
	}


