class P {    
       
    static {
        System.out.println("Parent static block");    
    }    
    {
        System.out.println("Parent initialisation  block");
    }
}
 

public class Childs extends P {    
    {
        System.out.println("Child initialisation block");
    }
    static {
        System.out.println("Child static block");
    }

      
    public static void main(String[] args) {
       //new Childs();    
    }
}