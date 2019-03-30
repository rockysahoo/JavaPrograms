import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheNumberOfCharacter {

	public static void main(String[] args) {
		String input="rkkkocdsroky";
		results(input);
	}

	private static void results(String input) {
		
		List add=new ArrayList();
		for(int i=0;i<input.length();i++) {
			add.add(input.charAt(i));
		}
		System.out.println(add);
		
		Set<Character> set=new HashSet<>();
		set.addAll(add);
		
		for(Character iter:set) {
			System.out.println(iter +" --> "+Collections.frequency(add, iter));
		}
		
	}

}
