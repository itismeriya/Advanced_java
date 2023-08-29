package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(101, "Gargy");    //101Gargy
		hMap.put(102, "Jimpi");    //102Jimpi
		hMap.put(103, "Sananda");  //103Sananda
		hMap.put(104, "Stuti");    //104Stuti
		
		Set set = hMap.entrySet();  //entrySet() returns both keys and values together
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry m = (Map.Entry)it.next();  //Entry is the method in the interface Map
			System.out.println("Key is : "+m.getKey()+"   Value is : "+m.getValue());
		}
		
//		//second way
//		for(Map.Entry m:hMap.entrySet())
//		{
//			System.out.println("Key is : "+m.getKey()+"   Value is : "+m.getValue());
//		}
		
		
		//remove by key only
		hMap.remove(102);
		System.out.println("\nAfter removing, the values are : ");
		for(Map.Entry m:hMap.entrySet())
		{
			System.out.println("Key is : "+m.getKey()+"   Value is : "+m.getValue());
		}
		
		hMap.remove(103, "Sananda");
		System.out.println("\nAfter removing, the values are : ");
		for(Map.Entry m:hMap.entrySet())
		{
			System.out.println("Key is : "+m.getKey()+"   Value is : "+m.getValue());
		}
		
		
		//replace
		hMap.replace(104, "Stuti Ghosh");
		System.out.println("\nAfter replacement, the new values are : ");
		for(Map.Entry m:hMap.entrySet())
		{
			System.out.println("Key is : "+m.getKey()+"   Value is : "+m.getValue());
		}
		
		hMap.replace(104, "Stuti", "Stuti Ghosh");
		System.out.println("\nAfter replacement, the new values are : ");
		for(Map.Entry m:hMap.entrySet())
		{
			System.out.println("Key is : "+m.getKey()+"   Value is : "+m.getValue());
		}
		
		
		//searching
		System.out.println(hMap.containsKey(102));
		System.out.println(hMap.containsValue("Stuti Ghosh"));
		System.out.println(hMap.containsValue("stuti ghosh"));  //it is case sensitive
		
		
		//fetch value based on key
		System.out.println(hMap.get(101));
		
		
		//print keys
		Set<Integer> keys = hMap.keySet();
		for(Integer i:keys)
		{
			System.out.println("Keys : "+i);
		}
		
		
		//copying from one hash set to another hash set
		Map<Integer, String> hMap2 = new HashMap<Integer, String>();
		hMap2.putAll(hMap2);
		System.out.println("\nAfter copying, the new hash map is : ");
		for(Map.Entry m:hMap.entrySet())
		{
			System.out.println("Key is : "+m.getKey()+"   Value is : "+m.getValue());
		}
		
		
		//clearing or removing all elements of hash map
		hMap2.clear();
		System.out.println("The hash map is : "+hMap2);
	}
}