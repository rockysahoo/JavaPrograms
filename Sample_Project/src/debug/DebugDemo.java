package debug;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DebugDemo {

	public static void main(String[] args) {
		
		//debug(1);
		//debug(10.5);
		arrayList();

	}

	private static void arrayList() {
		 Collection<String> c = new ArrayList<>();  
	        Collections.addAll(c, "Google", "Mozila FireFox", "Yahoo");  
	        System.out.println("Initial Collection: "+ c);  
	        Collection<String> c2 = Collections.unmodifiableCollection(c);         
	        c2.add("Safari");        
		
		
	}

	private static void debug(int d) {
		
		for(int input=d;input<100;input++) {
			
			System.out.println("print --> "+input);
			if(input==5) {
				//System.exit(0);
			}
			
		}
		
	}
private static void debug(double dd) {
		
		for(double input=dd;input<100;input++) {
			
			System.out.println("print --> "+input);
			if(input==12.5) {
				System.exit(0);
			}
			
		}
		
	}

}
