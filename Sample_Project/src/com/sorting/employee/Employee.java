package com.sorting.employee;

import java.util.Date;

public class Employee {
 String name;
 private int id;
 Date Joining_year;
 public String getName() {
	return name;
}



public int getId() {
	return id;
}



public double getSalary() {
	return salary;
}



private double salary;

 
public Employee(String name, int id, double salary ,Date Joining_year) {
	super();
	this.name = name;
	this.id = id;
	this.salary = salary;
	this.Joining_year=Joining_year;
}





public String toString() {
	
	return name+" , "+id+" , "+salary+" , "+Joining_year+"\n";
}

}
