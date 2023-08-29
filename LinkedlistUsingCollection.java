package collectionDemo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedlistUsingCollection {
	public static void main(String args[]) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		
		System.out.println(list);
		System.out.println("for loop");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("while loop");
		int n=0;
		while(list.size()>n) {
			System.out.println(list.get(n));
			n++;
		}
		
		System.out.println("for each loop");
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("Iterator ");
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		list.addFirst("apple");
		list.addLast("orange");
		list.add(2,"banana");
		
		System.out.println("after adding elements");
		for(String s:list) {
			System.out.println(s);
		}
		
		list.removeFirst();
		list.removeLast();
		list.remove(3);
		System.out.println("after deleting elements");
		for(String s:list) {
			System.out.println(s);
		}	
		
		
		list.add("bb");
		System.out.println("====================");
		for(String s:list) {
			System.out.println(s);
		}	
		System.out.println("first occurence "+list.indexOf("bb"));
		System.out.println("first occurence "+list.lastIndexOf("bb"));
		
		
		
		//convert linkedlist to arraylist
		ArrayList<String> aList=new ArrayList<String>(list);
		System.out.println("after conversion");
		
		for(String s:aList) {
			System.out.println(s);
		}	
	}
}
