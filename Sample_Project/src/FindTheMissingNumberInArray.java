import java.util.Scanner;

public class FindTheMissingNumberInArray {

	static int compare=0;
	
	
	
	public static void main(String[] args) {
		
		
	
		
		//Scanner sc=new Scanner(System.in);
		//int input=sc.nextInt();
		int[] input= {0,2,3,4,6,7,9,11};
	 
		
		for(int i=0;i<input.length;i++) {
		
			if(input[i] != compare) {
				System.out.println("the missign number is : " +compare);
				compare++;
			}
			compare++;
		}
		
		
		
		
		
		
	}

	
		
	
}
