
public class RecursionMethodCallAgainAgain {

	static int i;
	public static void main(String[] args) {
		call();

	}

	private static void call() {
           System.out.println("i --->"+i);	
           i++;
           call();
	}

}
