
public class SwapOf2Numbers {

	public static void main(String[] args) {
		
		//without 3rd variable
		int a=10;
		int b=50;
		
		System.out.println("before swap : a="+a+" b="+b);
		
		a=a+b; // 10+50=60
		b=a-b; // 60-50=10
		a=a-b; // 60-1=50
		
		System.out.println("after swap : a="+a+" b="+b);
		
		//with 3rd variable
		
		/**
		 
		  int c;
		    c=a;
		    a=b; 
		    b=c;
		  
		 
		  
		  
		 */
		

	}

}
