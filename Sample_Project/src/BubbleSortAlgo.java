/**
 * In bubble sort algorithm, array is traversed from first element to last element. 
 * Here, current element is compared with the next element. 
 * If current element is greater than the next element, it is swapped with temp variable.
 * 
 *
 */


public class BubbleSortAlgo {

	public static void main(String[] args) {
		int[] input= {4,3,2,4,125,5,7,4,7,88,44,34};
		sortTheArrayWithAsendingOrder(input);
		for(int results:input) {
			System.out.print(results+" , ");
		}
		
		System.out.println("");
		sortTheArrayWithDesendingOrder(input);
		for(int results:input) {
			System.out.print(results+" , ");
		}

	}

	private static void sortTheArrayWithDesendingOrder(int[] input) {
		for(int i=0;i<input.length;++i) {
			for(int j=1;j<input.length;j++) {
				if(input[j-1]<input[j]) {
					
					int temp=input[j-1];
					input[j-1]=input[j];
					input[j]=temp;
					
				}
			}
		}
		
	}

	private static void sortTheArrayWithAsendingOrder(int[] input) {
		
		for(int i=0;i<input.length;i++) {
			 for(int j=1;j<input.length;j++) {
				   if(input[j-1]>input[j]) { //index 0>1
					   int temp=input[j-1]; //temp=0
					   input[j-1]=input[j];//0=1
					   input[j]=temp;      //1=temp
					   
				   }
				 
			 }
			
		}
		
		
		
	}

}
