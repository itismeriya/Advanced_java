package collectionDemo;


import java.util.Scanner;
import java.util.HashSet;

public class AppendElementInHashSet 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//create an empty hash set
		HashSet<String> hashSet = new HashSet<String>();
		
		System.out.println("Enter the element you want to append : ");
		String element = sc.nextLine();
		
        //use add() method to add values in the hash set
		hashSet.add("Rose");
		hashSet.add("Tulip");
		hashSet.add("Lotus");
		hashSet.add("Sunflower");
		hashSet.add("Lily");
		hashSet.add("Asian Pigeonwings");
		hashSet.add(element);

		// print the hash set
		System.out.println("The Hash Set is : " +hashSet);
   }
}
