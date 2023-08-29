package collectionDemo;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("Fruit", 1);    //Fruit1
		hMap.put("Animal", 2);   //Animal2
		hMap.put("Flower", 3);   //Flower3
		hMap.put("Name", 4);     //Name4
		
		Set set = hMap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry m = (Map.Entry)it.next();
			System.out.println("Key is : "+m.getKey()+"   Value is : "+m.getValue());
		}
		
//		//second way
//		for(Map.Entry m:hMap.entrySet())
//		{
//			System.out.println("Key is : "+m.getKey()+"   Value is : "+m.getValue());
//		}
	}
}