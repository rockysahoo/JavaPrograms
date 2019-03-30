import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the numer : ");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		
		 showFiboniswSeries(number);

	}

	private static void showFiboniswSeries(int number) {
		
		for (int i = 1; i < number; i++) {
			
			int fn=i;
			int sn=i;
			int add=fn+sn;
			
			System.out.print(add + " ");
			fn=sn;
			sn=add;
		}
		
		
				
	}

}

