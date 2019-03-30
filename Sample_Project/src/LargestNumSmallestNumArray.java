
public class LargestNumSmallestNumArray {

	public static void main(String[] args) {
		int array_input[]= {200,4,2,1,4,1,55,10,4,0};
		
		int largest=array_input[0];
		int lowest=array_input[0];
		
		for(int i=1;i<array_input.length;i++) {
			
			if(array_input[i]>largest) {
				
				largest=array_input[i];
				
			}
			
			
		}
		
       for(int i=1;i<array_input.length;i++) {
			
			if(array_input[i]<lowest) {
				
				lowest=array_input[i];
				
			}
			
			
		}
		
		
		System.out.println("largeest -- > " +largest);
		System.out.println("lowest -- > " +lowest);
		
		
	}

}
