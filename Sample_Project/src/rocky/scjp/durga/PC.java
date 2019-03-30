package rocky.scjp.durga;

abstract class Parents{
	
	
	public Parents() {
		// TODO Auto-generated constructor stub
	}
	
	public int show(int i) {
		return 0;
		
	}
	
}

public class PC extends Parents
{

	
	PC(){
		System.out.println(this.hashCode()+" "+super.hashCode());
	}
   @Override
	 public int show(int i) {
		return 0;
		
	}
   
	
	public static void main(String[] args) {
		
		PC pc=new PC();
		
		
		

	}

}
