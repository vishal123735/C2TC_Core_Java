package prince;
import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer, String>();
		map.put(1, "vishal");
		map.put(3, "gupta");
		map.put(4, "prince");
		map.put(2, "priyanka");
		//map.put(null, null);
		//map.put(null, "berry");
		map.put(5, null);
		
		System.out.println("Iterating Hashmap");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}

	}

}
