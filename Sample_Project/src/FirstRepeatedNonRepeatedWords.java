
public class FirstRepeatedNonRepeatedWords {

	public static void main(String[] args) {
		
		String input="i am the best i know i am";
		result(input);
		
	}

	private static void result(String input) {
		
		String[] split=input.split(" ");
		
		for(int i=0;i<split.length;i++) {
			
			if(input.indexOf(split[i]) == input.lastIndexOf(split[i])) {
				
				System.out.println("Non Repeated words are : " +split[i]);
				
				//return; //if you want only first non reapted word
			}
			
			
		}
		System.out.println("--------------------------------------------------");
        for(int i=0;i<split.length;i++) {
			
			if(input.indexOf(split[i]) != input.lastIndexOf(split[i])) {
				
				System.out.println("Repeated words are : " +split[i]);
			}
			
			
		}
		
		
	}

}
