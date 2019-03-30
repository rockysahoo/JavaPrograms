package rocky.scjp.durga;

public class SortElement {

	public static void main(String[] args) {
		
		int[] input= {100,2,5,3,2,5,6,22,55,65,1111};
		
		results(input);
		
		 for(Integer ii: input) {
				
				System.out.print(ii+" , ");
			}
		
		
	}

	private static void results(int[] input) {
		
		for(int i=1;i<input.length;i++) {
			
			if(input[i-1]>input[i]) {
				
				int temp=input[i-1];
				input[i-1]=input[i];
				input[i-1]=temp;
				
			}
			
			
		}
		
		
     
		
	}

}
