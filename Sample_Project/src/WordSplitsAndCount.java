import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSplitsAndCount {
	public static void main(String[] args) {
	String input="i am the best i know i am";
	
	//spliting the sentence
	String[] split=input.split(" ");
	
	//storing inside list coz allowed all even duplicates
	List<String> list_ele=new ArrayList<>();
	for(int i=0;i<split.length;i++) {
		list_ele.add(split[i]);
	}
	
	System.out.println("list " +list_ele);
	//storing the list to Set ,avoiding the duplicates
	Set<String> ele_uni=new HashSet<>();
	  ele_uni.addAll(list_ele); //addAll() is in Collection
      System.out.println("set " +ele_uni);
       
      //Iterate all the set
      for(String iter:ele_uni) {
    	  
    	  
    	  //compare the set (unique element) to list(all elements) ,
    	  //return the integer ,number
    	  System.out.print(iter+" ---> "+" ");
    	  int count=Collections.frequency(list_ele, iter); //list[i, am, the, best, i, know, i, am] ,set[the, i, know, best, am] ,check 1ele from set to all ele in list
    	  System.out.println(count);
    	 // System.out.println(iter+" : " +Collections.frequency(list_ele, iter));
    	  
      }
      
      }
}
