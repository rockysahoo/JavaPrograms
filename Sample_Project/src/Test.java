
public class Test {

	//static final should be initialize at the time of creation coz its constant
	private static final int a=0;
	//final var only initialize only once ,inside constructor
	private final int b;
	
	 Test(){
		 b=9;
	 }
	public static void main(String[] args) {
		
       Test tt=new Test();
	}

}
