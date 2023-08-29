package collectionDemo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sananda");
		list.add("Koyel");
		list.add("Gargy");
		list.add("Shraboni");
		
		Vector<String> vector = new Vector<String>();
		vector.add("Jimpi");
		vector.add("Deesha");
		vector.add("Ritwika");
		vector.add("Swagata");
		
		vector.addAll(list);
		
		Iterator it = vector.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Object ob = vector.clone();
		System.out.println(ob);
		System.out.println(vector.contains("Jimpi"));
		System.out.println(vector.containsAll(list));
	}
}