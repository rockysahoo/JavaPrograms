
public class PlusOperatorInfinityLoop {

	public static void main(String[] args) throws InterruptedException {
		print();

	}

	private static void print() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("Hello 1--> "+i);
			i=+1; //here i always 1 like i=1 ,going to infinitive loop
			//i=+1 same as i=1
			System.out.println("Hello 2--> "+i);
			Thread.sleep(2000);
		}
		
		
	}

}
