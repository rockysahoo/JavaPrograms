
public class StarProg {

	public static void main(String[] args) {
		
		printStar1();
		System.out.println("---------------------------------");
		printStar2();
		System.out.println("---------------------------------");
		printStar3();
	}

	private static void printStar1() {

           for(int i=0;i<=5;i++) {
			
			for(int j=0;j<=i;j++){
				
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
				
	}
    
	private static void printStar2() {
          for(int i=0;i<=5;i++) {
			for(int k=5;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		
		
	}

	private static void printStar3() {
		for(int i=0;i<=5;i++) {
			for(int k=5;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
