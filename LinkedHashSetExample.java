package collectionDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetExample 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("aa");
		linkedSet.add("bb");
		linkedSet.add("cc");
		
		for(String i:linkedSet)
		{
			System.out.println(i);
		}
		
		//We should create hash set or linked hash set before tree set. We should not create only the tree set 
		//here because tree set is slower than hash set or linked hash set as it stores the object by comparing 
		//which is very time consuming. So, we should create hash set or linked hash set before creating tree set. 
		//When the creation of hash set or linked hash set is done, then we should create the tree set. 
		
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.add(45);
		tSet.add(15);
		tSet.add(1);
		tSet.add(75);
		tSet.add(60);
		
		System.out.println(tSet);
		
		TreeSet<String> tSet1 = new TreeSet<String>();
		for(String s:tSet1)
		{
			System.out.println(s);
		}
	}
}