package rocky.scjp.durga;

import java.util.ArrayList;
import java.util.List;

public class P {
	

	
public static void main(String...strings ) {
	
	// TODO Auto-generated method stub
			ArrayList a=new ArrayList();
			a.add("A");
			a.add("B");
			a.add(10);
			a.add("A");
			a.add(null);
			System.out.println(a);
			ArrayList a1=new ArrayList();
			a1.add(1);
			a1.add("B");
			a.addAll(a);//waht is this ....why you are adding it again
			System.out.println(a); //expected the output
			a.add(5);
			a.add(6);
			System.out.println(a);
			a.remove("A");
			System.out.println(a);
			a.add(1);
			a.retainAll(a1);
			System.out.println(a.get(199));

}


}
