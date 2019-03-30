package rocky.scjp.durga;

public class FinalKeyword {
	
	//final int a=1;
	//final int b=2;
	
	int c=0;
	
	 int a=1;
	 int b=2;
	
	public static void main(String ...strings ) throws InterruptedException {
		
		
		FinalKeyword obj1=new FinalKeyword();
		obj1.run();
		
	}
	
	void run() throws InterruptedException {
		
		while(a<b) {
			System.out.println("in a loop " + c);
			Thread.sleep(1000);
			c++;
		}
		
		//this one ll be unreachbale while a,b are final but here JVM always expected above line execution ll be cloased then this line ll be execute nut
		// this will not happened 
		System.out.println("Unreachable stmt");
	   
		
		
	}

}
