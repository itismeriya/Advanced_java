package collectionDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Double>linkedMap = new LinkedHashMap<String,Double>();
		linkedMap.put("Chicken Biryani", 150.50);
		linkedMap.put("Mutton Biryani", 200.50);
		linkedMap.put("Egg roll", 70.50);
		linkedMap.put("Polao", 300.00);
		
		//generating a set of map entries
		Set set = linkedMap.entrySet();
		 Iterator itr = set.iterator();
		 while(itr.hasNext()) {
			 Map.Entry m =(Map.Entry)itr.next();
			 System.out.println("key:" +m.getKey() +"  Value:" +m.getValue());
			 
		 }
		 TreeMap<String,Double>treeMap = new TreeMap<String,Double>(linkedMap);
		 treeMap.put("Kebab", 350.50);
		 treeMap.put("Sahi Kebab", 440.50);
		 
		 System.out.println("After sorting using key:");
		 for(Map.Entry m:treeMap.entrySet()) {
			 System.out.print(m.getKey());
			 System.out.print(" " +m.getValue());
		 }
	}

}