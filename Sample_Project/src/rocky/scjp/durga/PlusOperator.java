package rocky.scjp.durga;

public class PlusOperator {

	public static void main(String[] args) {
		
		int i=2;
		
		i=i++;
		//It will increment but still it ll print the old value
		//next time it ll print the increment value
		System.out.println("1st --> "+i);
		
		i=i++;
		
		//same as expected
		System.out.println("2nd --> "+i);
		
		i=++i;
		// ++ operator will increse the value on same time ,
		//it ll print the latest value as expected 
		System.out.println("3rd --> "+i);

	}

}
/**

i++ operator will increase the value next time loop came ,it ll increase the value but print the next time
still pointing to the old value ...

++i operator will increase the value on same line and print it on next line ,it ll update at same time

*/