/*
 ->Drawback --> by default singleton class is lazy loading ,so it can't create object while loading ,
this is why ,people followed the static lass ,it is the alternative option of singleton class

-> why the singleton class method is synchronized(thread safe) by default
suppose at a time 2 threads call to getInstance() , if instance== null then it ll create the object of that class but if at time 
2 threads called to same method then ,it ll instantiate twice ,but the singleton principle is saying ,it ll instantiate once ,
for this violation we have to make the method as synchronized always .

-> singleton class object used in database connectivity ,remote connection 
*/

//Lazy Initialization
public class MySingletonClass {
  private static MySingletonClass mysingleton;
  
  private MySingletonClass() {
	  
  }
  
  public static synchronized MySingletonClass getInstance() {
	  if(mysingleton==null) {
		  mysingleton=new MySingletonClass();
	  }
	  return mysingleton;
  }
  
  public void DoYourJob() {
	  //TODO
  }
}

/**
//Early Initialization
public class MySingleton1{
	
	private static MySingleton1 mys1=new MySingleton1();
	
	private MySingleton1() {
		
	}
	
	public static MySingleton1 getInstance() {
		return mys1;
	}
	
	public void DoYourJob() {
		
		//TODO
	}
	
}
**/