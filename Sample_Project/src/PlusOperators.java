
public class PlusOperators {

	public static void main(String[] args) {

		sample();
	
		sample2();
	}

	private static void sample2() {
		Integer i = 0;
		pass(i);
		System.out.println(--i); // -1 , i=i-1 (0-1)

		
	}

	private static void pass(Integer i) {
		
		System.out.println(++i); //1 ,i=i+1 (0+1)
	}

	private static void sample() {
		
		int i=5;
		//i=i++; //5
		//i=++i; //6
		
		i = i++ + ++i; //12 ,but here i++(5) but i++ +(6) ,then ++i (6) as always
		System.out.println(i);
	}

	
}
