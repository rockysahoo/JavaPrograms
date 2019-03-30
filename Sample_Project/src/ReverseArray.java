
public class ReverseArray {

	public static void main(String[] args) {
		
		int array_input[]= {1,2,3,4,5,6};
		
		int results[]=new int[array_input.length];
		int count=0;
		
		for(int i=array_input.length-1;i>=0;i--) {
			
			//results[count++]=array_input[i];
			results[count]=array_input[i];
			count++;
			
		}
		
	   for(int j=0;j<results.length;j++) {
		   
		   System.out.print(results[j]+" , ");
	   }
		
		

	}

}
