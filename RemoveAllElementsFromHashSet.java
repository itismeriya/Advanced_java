package collectionDemo;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveAllElementsFromHashSet 
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
		
		//print the hash set elements
		System.out.println("The hash set is : " +hashSet);
		
		//remove all elements from the hash set
		hashSet.clear();
		System.out.println("\nAfter removing all the elements from the hash set, the hash set becomes : "+hashSet); 
	}
}