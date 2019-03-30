package rocky.scjp.durga;

import java.io.FileNotFoundException;
import java.io.IOException;



public class R{
	
	R(){
		
		System.out.println("Constructor");
	}
	
	static {
		
		System.out.println("static block");
		
	}
	
	{
	System.out.println("instance/empty block");
	
	}
	
	//System.out.println("instance/empty block"); CE
	
	public static void main(String[] args) {
		
             
		
		//R r=new R();
		
		System.out.println("main");
		
	
	}

}


/**

->While creating object, Before create the object (called the constructor) ,the main() will call the static block and then 
   it ll check the instance/non-static/empty block if is there then it will execute ,then it ll call the constructor to initialize 
   the non-static variable ,then it ll back to main 
  o/p: 
       static block
       instance/empty block
       Constructor
       main
->It you ll not create the object then only static block ll execute    

   o/p:
       static block
       main



/** Overriding  P -> C
protected --> protected/public
default->default/protected/public


*/