package rocky.scjp.durga;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

class Student{
	private int id;
	private String f_name;
	private String l_name;
	Student(int id,String f_name,String l_name){
		
		this.id=id;
		this.f_name=f_name;
		this.l_name=l_name;
	}
	
	//Override toString() to get the class name only ,not required all	
	public String toString() {
		
		//if you want full package name ,used getClass().getName()
		return getClass().getSimpleName();
	}
	
	
}
class Employee{
	private int id;
	private String f_name;
	private String l_name;
	Employee(int id,String f_name,String l_name){
		
		this.id=id;
		this.f_name=f_name;
		this.l_name=l_name;
	}
	
	//Override toString() to get the class name only ,not required all	
		public String toString() {
			
			//if you want full package name ,used getClass().getName()
			return getClass().getSimpleName();
		}
		
	
}



class MyClass {

	
	
	public static void main(String[] args) {
		
		List<Student> dataList_Student=new ArrayList<>();
		dataList_Student.add(new Student(1,"uma","Patra"));
		dataList_Student.add(new Student(2,"uma","Khai"));
		
		
		List<Employee> dataList_Employee=new ArrayList<>();
		dataList_Employee.add(new Employee(1,"uma","Patra"));
		dataList_Employee.add(new Employee(2,"uma","Khai"));
		
		
		
		/*
		 * you may send different type of list.it could be dataList1 or dataList
		 */
		m1(dataList_Student);  //Student type
		//m1(dataList_Employee);  //Employee type
	}

	@SuppressWarnings("unused")
	private static void m1(List<? extends Object> data) {
		
		 
		Object dataList_Student=data.get(0);
		System.out.println("Expect : Student ---> Actula : "+dataList_Student);
		
		
		
		Object dataList_Employee=data.get(0);
		//System.out.println("Expect : Employee ---> Actual : "+dataList_Student);;
		
		
	}
}

