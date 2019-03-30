package rocky.scjp.durga;

interface I{
	
	void a();
	void b();
	void c();
	void d();
	
		
}


abstract class AA implements I{
	
	public void a() {
		
		System.out.println("a");
	}
	
}

public class A extends AA {

	public static void main(String[] args) {
		AA aa=new A();
            //i.a();
            //i.b();
            //i.c();
           // i.d();
	}

	@Override
	public void b() {
System.out.println("b");		
	}

	@Override
	public void c() {
System.out.println("c");		
	}

	@Override
	public void d() {
System.out.println("d");		
	}

}
