
public class StringRecursion {

	static String rev="";
	public static void main(String[] args) {
		//String input="rocky";
		
		reverseRecursion("sahoo");
		System.out.println(rev);
		
	}

	private static String reverseRecursion(String input) {
		
		if(input.length()==0) {
			
			return input;
		}else {
		
		String sub=input.substring(1);
		//System.out.println(sub);
		rev=rev.concat(reverseRecursion(sub))+input.charAt(0);
		
		return rev;
		}
		
	}
	

}
