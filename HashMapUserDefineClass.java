package collectionDemo;
import java.util.HashMap;
import java.util.Map;
public class HashMapUserDefineClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Student> students=new HashMap<Integer,Student>();
		
		//create book
//		Student s1=new Student(101,"Koyel","Shyambazar");
//		Student s2=new Student(102,"Rittika","Kalighat");
//		Student s3=new Student(103,"Shubham","Park street");
		
		//add students to map
//		students.put(1, s1);
//		students.put(2, s2);
//		students.put(3, s3);
		
		students.put(1, new Student(101,"Koyel","Shyambazar"));
		students.put(2, new Student(102,"Rittika","Kalighat"));
		students.put(3, new Student(103,"Shubham","Park Street"));
		
		//traverse the map
		for(Map.Entry<Integer, Student> m:students.entrySet())
		{
			int key=m.getKey();
			//Student s=m.getValue();
			System.out.print("key:"+m.getKey());
			//System.out.println(" "+s);
			System.out.println("Id: "+m.getValue().getId()+"Name: "+m.getValue().getName()+"Address: "+m.getValue().getAddress());
			System.out.println("Haschode of map object: "+students.hashCode());
		}
	}

}
