
public class AmbiguityMethodCall {

	public static void main(String[] args) {

		method1(null); // Ambiguity b/c we have 2 same types present String,StringBuffer
		// method1("hello"); // call String
		// method1(3); // call Object
		// method1(new StringBuffer("")); // call StringBuffer

	}

	public static void method1(Object obj) {
		System.out.println("Object"); // ---> this ll take any types of values but always 2nd option(if not matched
										// any method)
	}

	public static void method1(String obj) {
		System.out.println("String"); // --> takes String type and null -> method1("hello"); , method1(null);
	}

	public static void method1(StringBuffer obj) {
		System.out.println("StringBuffer"); // -->Take StringBuffer types and null -> method1(new StringBuffer("")); ,method1(null);
	}

}
