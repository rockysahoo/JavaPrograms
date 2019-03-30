
public class ReverseASentence {

	public static void main(String[] args) {
		
		String input="i am the best";
		String[] split=input.split(" ");
		String rev="";
		
		for(int i=split.length-1;i>=0;i--) {
			rev+=split[i]+" ";
		}
		System.out.println(rev);
	}

}
