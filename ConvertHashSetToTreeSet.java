package collectionDemo;

//Write a Java program to convert a hash set to a tree set.




import java.util.HashSet;
import java.util.TreeSet;

public class ConvertHashSetToTreeSet 
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
		System.out.println("The hash set elements are : " +hashSet);
		
		//create a TreeSet of HashSet elements
		TreeSet<String> treeSet = new TreeSet<String>(hashSet);
		
		//display TreeSet elements
		System.out.println("\nAfter converting from hash set to tree set, the tree set elements are : ");
	    for(String element : treeSet)
	    {
	        System.out.println(element);
	    }
	}
}