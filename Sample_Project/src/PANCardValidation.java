import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PANCardValidation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the pan card number : ");
		String panCard=input.nextLine();
		
		Pattern pattern=Pattern.compile("[a-z]{5}[0-9]{4}[a-z]{1}");
		Matcher matcher=pattern.matcher(panCard);
		if(matcher.matches()) {
			System.out.println("Pan number is Valid");
		}else
		{
			System.out.println("Its not a valid pan number");
		}
			

	}

}
