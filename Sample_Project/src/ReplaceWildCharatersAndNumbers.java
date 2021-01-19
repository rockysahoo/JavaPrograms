
public class ReplaceWildCharatersAndNumbers {

	public static void main(String args[]) {
		String s1 = "My name is Khan. My  name is 123 121 Bob. My! name; is So-noo. ";
		System.out.println("Before :\n"+s1);
		s1 = s1.replaceAll("i", "I");// replaces all occurrences of "i" to "I"
		//s1 = s1.replaceAll("is", "IS");// replaces all occurrences of "is" to "IS"
		s1 = s1.replaceAll("[.,!,;]", ""); // for wind characters keep inside brackets []
		s1 = s1.replaceAll("[0,1,2,3,4,5,6,7,8,9]", ""); // remove numbers []
		s1 = s1.replaceAll("  ", " "); // double space to single space
		s1 = s1.replaceAll("  ", " "); // double space to single space
		s1 = s1.trim(); // remove last space
		
		System.out.println("After remove all wild charaters with numbers and spaces :\n"+s1);
		
		String[] noOfWord = s1.split(" ");
		System.out.println("noOfWord :"+noOfWord.length);
	}

}
