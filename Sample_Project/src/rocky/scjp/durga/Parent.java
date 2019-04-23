package rocky.scjp.durga;

import java.util.ArrayList;

public class Parent {

	static int a=2;
	
	public static void main(String[] args) {
		
		
		System.out.println(AAAA.aa);
		AAAA.m2();

	}

	private static void m1() {
		System.out.println("static method");
		
	}

}

class AAAA{
	
	static int aa=3;
	
	static void m2() {
		
		System.out.println("m2() from A class");
	}
}
