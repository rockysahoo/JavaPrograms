
public class FindTheNonRepetedCharInWord {

	public static void main(String[] args) {
		String input="hello";
		printTheResult(input);
		System.out.println(" ");
		printTheResult1(input);

	}
    
	//Repeated
	private static void printTheResult1(String input) {
		for(int i=0;i<input.length();i++) {
			
			Character ele=input.charAt(i);
			
			if(input.indexOf(ele) != input.lastIndexOf(ele)) {
				System.out.print(ele +" , ");
			}
		}
		
	}
   //Non Repeated
	private static void printTheResult(String input) {
		
		for(int i=0;i<input.length();i++) {
			
			Character ele=input.charAt(i);
			
			if(input.indexOf(ele)==input.lastIndexOf(ele)) {
				
				System.out.print(ele+" , ");
			}
			
		}
		
	}

}
