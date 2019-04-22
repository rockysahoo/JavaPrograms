import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		int input[]= {3,4,6,44,5,1,5,22,55,11,22,44,1};
		List<Integer> list_array=new ArrayList<>();
		//With API
		findDuplicates(input, list_array);
         System.out.println("Duplicates are : " +list_array);
         
         //Without API
         printRepeating(input);
         
	}

	private static List<Integer> findDuplicates(int[] input,List<Integer> list_array) {
		
		Set<Integer> unique=new HashSet<>();
		for(int i=0;i<input.length;i++) {
			
			//Set does not allowed the duplicates ,if it is duplicate then add() will return false
			//otherwise for 1st elemet it ll always return true ,for the duplicates It will just 
			//Ignored ,not throw any exception 
			//b==true means not duplicate , b==false means duplicate
			boolean b=unique.add(input[i]);
			
			//means this value is duplicate input[i]
			if(b==false) {
				//Storing inside List ,coz it is allowed the all element with order
				list_array.add(input[i]);
			}
			
		}
		//return the output of duplicates
		return list_array;
	}
	
	static void printRepeating(int arr[]) 
	{ 
	    int i, j; 
	    System.out.print("Repeating elements are --> ");
	    for(i = 0; i < arr.length; i++) 
	        for(j = i + 1; j < arr.length; j++) 
	        if(arr[i] == arr[j]) 
	           System.out.print(arr[i]+" , "+" ");
	}  

}
