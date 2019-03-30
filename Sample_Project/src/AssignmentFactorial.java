import java.util.Scanner;

class AssignmentFactorial {

	public static void main(String[] args) {
		int n=2;
		//(2n+1)!
		int formula = 2*n + 1 ;
		int sum=factorial(formula);
		while( formula != 0 )
		{
		sum += factorial(--formula);
		}
		System.out.println(sum);
		}

		public static int factorial(int n)
		{
		if(n==0 || n==1) return 1;
		else return n*factorial(n-1);
		}

        }

	


