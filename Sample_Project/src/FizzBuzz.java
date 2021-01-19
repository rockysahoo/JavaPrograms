import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {

		Object[] allInputs = new Integer[10]; // allowing in java

		Integer[] allInput = new Integer[9];
		allInput[0] = 1;
		allInput[1] = 3;
		allInput[2] = 4;
		allInput[3] = 5;
		allInput[4] = 6;
		allInput[5] = 7;
		allInput[6] = 9;
		allInput[7] = 10;
		allInput[8] = 15;

		for (int i = 0; i < allInput.length; i++) {

			//System.out.println(allInput[i]);
			call(allInput[i]);

		}

	}

	private static void call(Integer integer) {
		if (integer/3 == 0) { // 3,6,9,15

			System.out.println("Fizz");

		} else if (integer/5 == 0) { // 5,10,15

			System.out.println("Buzz");

		} else if (integer/3 == 0 && integer/5 == 0) { // 15

			System.out.println("Fizz Buzz");

		} else {
			System.out.println(integer);
		}

	}

}
