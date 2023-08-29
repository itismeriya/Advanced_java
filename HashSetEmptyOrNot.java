package collectionDemo;


import java.util.HashSet;

public class HashSetEmptyOrNot 
{
	public static void main(String[] args) 
	{
		//create an empty hash set
		HashSet<String> hashSet = new HashSet<String>();
		
		
        //use add() method to add values in the hash set
		hashSet.add("Rose");
		hashSet.add("Tulip");
		hashSet.add("Lotus");
		hashSet.add("Sunflower");
		hashSet.add("Lily");
		hashSet.add("Asian Pigeonwings");

		//print the hash set
		System.out.println("The orginal hash set is : " +hashSet);
		
		//check whether the hash set is empty or not
		System.out.println("\nIs the hash set empty? "+hashSet.isEmpty());
		
		//removing all the elements from the hash set
		hashSet.removeAll(hashSet);
	    System.out.println("\nAfter removing all the elements from the hash set, the hash set becomes : "+hashSet);   
   }
}