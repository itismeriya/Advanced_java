package collectionDemo;

import java.util.TreeSet;

public class TreeSetToPrintSomeColours 
{
	public static void main(String[] args) 
	{
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Black");
		treeSet.add("Red");
		treeSet.add("Blue");
		treeSet.add("Golden");
		treeSet.add("Silver");
		
		System.out.println("The tree set is : "+treeSet);
	}
}