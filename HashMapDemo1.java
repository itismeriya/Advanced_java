package collectionDemo;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1
{
	public static void main(String[] args) 
	{
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("Fruit", "Mango");  //FruitMango
		hMap.put("Animal", "Dog");   //AnimalDog
		hMap.put("Flower", "Rose");  //FlowerRose
		hMap.put("Name", "Deesha");  //NameDeesha
		
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