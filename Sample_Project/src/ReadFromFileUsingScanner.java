import java.io.File;
import java.util.Scanner;

public class ReadFromFileUsingScanner {
	
	static String output=null;
	public static void main(String[] args) throws Exception 
	  { 
	    // pass the path to the file as a parameter 
	    File file = 
	      new File("C:\\Users\\sbiswajit\\Desktop\\readfile.txt"); 
	    Scanner sc = new Scanner(file); 
	    
	   
	  
	    while (sc.hasNextLine()) 
	      //System.out.println(sc.nextLine()); 
	    	output=sc.nextLine();
	   
	        System.out.println(output);
	  } 
	

}

/**

Using Scanner class: A simple text scanner which can parse primitive types and strings using regular expressions.
A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. 
The resulting tokens may then be converted into values of different types using the various next methods.

*/