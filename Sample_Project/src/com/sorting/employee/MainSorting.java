package com.sorting.employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainSorting {

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
		
		
		
		Employee e1=new Employee("rocky", 101, 5000.00,new Date(2015-1900,01,05));
		Employee e2=new Employee("pulu", 100, 50000.00,new Date(2017-1900,03,12));
		Employee e3=new Employee("babul", 201, 15000.00,new Date(2017-1900,02,11));
		Employee e4=new Employee("ranjan", 200, 1000.00,new Date(2018-1900,01,12));
		
		//For 1 property 
		@SuppressWarnings("unchecked")
		Set<Employee> add=new TreeSet<>(new DateComparator());{
			
			add.add(e1);
			add.add(e2);
			add.add(e3);
			add.add(e4);
			
			System.out.println("Sort by only 1 property i.e Date \n" +add);
			
		}
		
		
	}

}
class NameComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		Employee ee1=(Employee)arg0;
		Employee ee2=(Employee)arg1;
		
		String ss1=ee1.getName();
		String ss2=ee2.getName();
		
		
		
		return ss1.compareTo(ss2);
	}
	
	
}
class IDComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		Employee ee1=(Employee)arg0;
		Employee ee2=(Employee)arg1;
		
		Integer i1=ee1.getId();
		Integer i2=ee2.getId();
		
		
		return i1.compareTo(i2);
	}
}

class DateComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Employee ee1=(Employee)o1;
		Employee ee2=(Employee)o2;
		
		Date d1=ee1.Joining_year;
		Date d2=ee2.Joining_year;
		
		return d1.compareTo(d2);
		
	}
	
	
}