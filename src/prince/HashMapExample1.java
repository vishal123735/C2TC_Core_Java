package prince;
import java.util.HashMap;

import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer, String>();
	map.put(1, "mango");
	map.put(2, "Grapes");
	map.put(3, "Apple");
	map.put(4, "Banana");
	map.put(null, null);
	map.put(null, "berry");
	map.put(5, null);
	
	System.out.println("Iterating Hashmap");
	
	for(Map.Entry m : map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		
	}



	}

}
