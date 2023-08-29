package collectionDemo;

import java.util.HashSet;
import java.util.TreeSet;

public class HashMapTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. adding element at the end in a hash set
		
		HashSet<String> hset = new HashSet<String>();
		hset.add("koyel");
		hset.add("ankana");
		hset.add("bhavna");
		System.out.println("Before adding  the element:" +hset);
		String element = "urwasyi";
		hset.add(element);
		System.out.println("After adding the element:"+hset);
		
		//2.To check whether hash set is empty or not
		
		if (hset.isEmpty()) {
			System.out.println("Hash set is empty");
			
		}
		else {
			System.out.println("It is not empty");
		}
		
		//3. Converting hashset to treeset
		
		TreeSet<String> treeset = new TreeSet<String>(hset);
		
		  System.out.println("Hash Set: " + hset); 
		  System.out.println("Tree Set: " +treeset);
        
        //4. to remove all elements from a hashset
		  
        System.out.println("Before removing  the elements:" +hset);
        hset.clear();
        System.out.println("After removing all the element:"+hset);
        
        //5.add some color to the tree set and print it out
        
        TreeSet<String> tset = new TreeSet<String>();
        
        tset.add("Pink");
        tset.add("Green");
        tset.add("Red");
        tset.add("Yellow");
        tset.add("Orange");
        
        System.out.println("Colors in the Tree set: " + tset);
        
	}

}