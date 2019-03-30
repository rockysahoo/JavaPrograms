package rocky.scjp.durga;

import java.util.ArrayList;
import java.util.List;

public class FindTheNoOfWords {

	public static void main(String[] args) {
		
		
		int input[] = { 5, 6, 2,4,1,3,13,3,7,5,1,8, 9, 10 };
		
		Sort(input);
	}

	private static void Sort(int[] input) {
		
		
		for(int i=0;i<input.length;i++) {
			
			for(int j=1;j<input.length;j++) {
				
				if(input[j-1] > input[j]) {
					
					int temp=input[j-1];
					input[j-1]=input[j];
					input[j]=temp;
					
				}
				
				
				
			}
		}
		
		List<Integer> add=new ArrayList<>();
		for(int k=0;k<input.length;k++) {
			System.out.print(input[k] + " , ");
			
				}
			
		
		
		
	}
}


