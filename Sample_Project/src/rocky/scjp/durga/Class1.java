package rocky.scjp.durga;

public class Class1 {

	public void m1(String s)
	{
	System.out.println("String Version");
	}
	public void m1(Object o)
	{
	System.out.println("Object Version");
	}
	public void m1(Integer i)
	{
	System.out.println("Integer Version");
	}
	public static void main(String arg[])
	{
		Class1 t = new Class1();
	     t.m1("raju"); //String Version
	     t.m1(new Object()); //Object Version
	     //t.m1(null);
	     t.m1(1);
	     t.m1(7.8);
	}
}


/**

the folw works like Object -->String/Integer--> arguments

it ll not find the proper match then it ll call to Object class ,
it you have 2 option(String/Integer) for 1 arguments then it ll shown ambiguity error


*/