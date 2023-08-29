package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<Integer> hSet = new HashSet<Integer>(8,0.65f); //here I have taken the initial capacity as 8 
		                                                       //and load factor as 65%, load factor above 65% 
		                                                       //will increase or can can increase when it is 
		                                                       //above the default load factor
   //when we create an empty hash set, the default initial capacity-16 load factor 0.75, when your hash set is 75%
		hSet.add(34);
		hSet.add(56);
		hSet.add(78);
		hSet.add(88);
		hSet.add(98);
		hSet.add(48);
		hSet.add(678);
		hSet.add(9898);
		hSet.add(8748);
		
//		for(Integer i:hSet)
//		{
//			System.out.println(i);
//			System.out.println("Hashcode : "+i.hashCode());
//		}
		
		System.out.println(hSet.size());
		
//		LinkedList<String> list = new LinkedList<String>();
//		list.add("aa");
//		list.add("bb");
//		list.add("cc");
//		list.add("dd");
//		
//		HashSet<String> hSet1 = new HashSet<String>(list);
//		System.out.println(hSet1);
		hSet.add(56);
		hSet.add(null);
		hSet.add(null);
		System.out.println(hSet);
		System.out.println(hSet.remove(8748));
		System.out.println(hSet);
		System.out.println(hSet.contains(48)); 
		
		
		//convert hashSet into array
		Integer[] arr = new Integer[hSet.size()];
		hSet.toArray(arr); //converting from hashSet to array
		
		System.out.println("After conversion : ");
		for(Integer i:arr)
		{
			System.out.println(i);
		}
		
		
		//convert hashSet into list
		ArrayList<Integer> list = new ArrayList<Integer>(hSet);
		
		Iterator it = hSet.iterator();
		hSet.add(45);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	//create one user define class, create hashset based on that class
}