import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOccurance {

	public static void main(String[] args) {

		String input = "this this is biswajit biswajit";

		output(input);
		outputWithSingleInput();
		countFrequenciesMap();
		countNumberinString();
		removeNumberfromString();
		findOccerence();

	}

	private static void findOccerence() {
		String input="hfaiaaiodhabcfwhfabbccffhwfwhabchwabfiwabcfwhghbdhfhwacpjgfohabc";
		//Scanner enterInput=new Scanner(System.in);
		//String userEnter=enterInput.nextLine();
		Pattern pattern=Pattern.compile("abc"); //userEnter
		Matcher matcher=pattern.matcher(input);
		int count=0;
		while(matcher.find()) {
			count++;
		}
		System.out.println("abc" +" Occourance count is:"+count); //OP:4
		
	}

	private static void removeNumberfromString() {
		String input="hfwhf34ifi670hfw34421jkjh434nkbfdfddrh53";
		input=input.replaceAll("[0,1,2,3,4,5,6,7,8,9]", "");
		System.out.println("Number removed from String:"+input); //only characters
	}

	private static void countNumberinString() {
		
		String input="hfwhf34ifi670hfw34421jkjh434nkbfdfddrh53";
		Pattern pattern=Pattern.compile("[0,1,2,3,4,5,6,7,8,9]");
		Matcher matcher=pattern.matcher(input);
		int count=0;
		while(matcher.find()) {
			count++;
		}
		System.out.println("Integer count is :"+count); //
		
	}

	private static void outputWithSingleInput() {
		System.out.println("\noutputWithSingleInput()");
		System.out.println("----------------------------------------------");
		String in = "i have a male cat. the color of male cat is Black";
		int i = 0;
		Pattern p = Pattern.compile("male cat");
		Matcher m = p.matcher( in );
		while (m.find()) {
		    i++;
		}
		System.out.println("male cat :" +i); // Prints 2
		
	}

	private static void output(String input) {
		System.out.println("output(String input)");
		System.out.println("--------------------------------------------");
		String[] inputSplit = input.split(" ");

		List<String> addElement = new ArrayList<>();

		for (int i = 0; i < inputSplit.length; i++) {
			addElement.add(inputSplit[i]);
		}

		Set<String> findUnique = new HashSet<>();
		findUnique.addAll(addElement);

		for (String results : findUnique) {

			System.out.print(results + " : ");
			System.out.println(Collections.frequency(addElement, results));
		}

	}
	
	public static void countFrequenciesMap() 
    { 
		System.out.println("countFrequenciesMap()");
		System.out.println("----------------------------------------------");
		
		ArrayList<String> list = new ArrayList<String>(); 
        list.add("biswajit"); 
        list.add("sahoo"); 
        list.add("biswajit"); 
		
        // hashmap to store the frequency of element 
        Map<String, Integer> hm = new HashMap<String, Integer>(); 
  
        for (String i : list) { 
			Integer j = hm.get(i); 
            hm.put(i, (j == null) ? 1 : j + 1); 
        } 
  
        // displaying the occurrence of elements in the arraylist 
        for (Map.Entry<String, Integer> val : hm.entrySet()) { 
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times"); 
        } 
    } 

}
