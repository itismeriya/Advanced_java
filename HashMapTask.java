package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("Koyel", 101);
		hmap.put("Bhavna", 102);
		hmap.put( "Swagata", 103);
		hmap.put("Urwasyi", 104);
		
		
		Set set = hmap.entrySet();
		Iterator it = set.iterator();
		
		  while(it.hasNext()) { Map.Entry m =(Map.Entry)it.next();
		  System.out.println("Key is :" +m.getKey() +"\tValues:"+m.getValue());
		  
		  }
		 
		
		/*
		 * for(Map.Entry m: hmap.entrySet()) { System.out.println("Key is::"
		 * +m.getKey()+ "Value is:"+m.getValue());
		 * 
		 * }
		 */
	}

}
