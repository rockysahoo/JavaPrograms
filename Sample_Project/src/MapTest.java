import java.util.*;

public class MapTest {

	public static void main(String[] args) {

      HashMap<Integer,String> map_add=new HashMap<>();
      map_add.put(1, "rocky");
      map_add.put(2, "hari");
      map_add.put(1, "sam");
      System.out.println(map_add);
      
		Set<Map.Entry<Integer, String>> map_entry=map_add.entrySet();
		
		for(Map.Entry<Integer, String> iter:map_entry) {
			
			System.out.println(iter.getKey()+" -- "+iter.getValue());
			
		}
		
		
	}

}
