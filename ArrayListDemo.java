package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	//List<String> list=new ArrayList<String>();
/*
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);
		
		System.out.println(list);
		System.out.println(list.size());
		list.add(60);
		list.add(70);
		System.out.println(list.size());
		
		//insert in specific position
		list.add(3,120);
		System.out.println(list);
		
		//for each
		System.out.println("Iterate using for each loop");
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		
		System.out.println("Before remove,the elements are: "+list.size());
		list.remove(5);
		
		System.out.println("After remove,the elements are: ");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("After remove,the elements are: "+list.size());
		
		System.out.println("Iterate using while loop: ");
		int n=0;
		while(n<list.size())
		{
			System.out.println(list.get(n));
			n++;
		}
		
		System.out.println("Iterate using iterator");
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
*/		
		//convert Array to arrayList
		String[] names= {"deesha","jimpy","dalia","stuti","koyel","sushri"};
		
		/*ArrayList<String> listName=new ArrayList<String>(Arrays.asList(names));
		System.out.println(listName);
		
		listName.add("sananda");
		listName.add("swagata");
		System.out.println(listName);
		*/
		
		ArrayList<String> listName=new ArrayList<String>();
		/*
		Collections.addAll(listName,names);
		System.out.println(listName);
		*/
		
		/*
		for(int i=0;i<names.length;i++) {
			listName.add(names[i]);
			System.out.println(listName);
		*/
		
		//sort the arrayList
		Collections.sort(listName);
		System.out.println("After sort as ascending order:");
		System.out.println(listName);
		
		Collections.sort(listName,Collections.reverseOrder());
		System.out.println("After sort as descending order:");
		System.out.println(listName);
		}
	}


