package collectionDemo;

public class OverrideEqualsAndHasCodeMain {

	public static void main(String []args) {
	Product p1=new Product(101,"mobile");
	Product p2=new Product(102,"Tv");
	Product p3=p2;
	System.out.println(p2.equals(p3));
	Product p4=new Product(101,"mobile");
	System.out.println(p2.hashCode()+" "+p3.hashCode());
	if(p2.hashCode()==p3.hashCode()) {
		System.out.println(p2.equals(p3));
	}
	System.out.println(p1.equals(p4));
	
	Student s1=new Student(1,"abc","abc");
	System.out.println(p1.equals(s1));
	}
// 	Product p1=new Product(101,"mobile");
//	Product p2=new Product(101,"mobile");
//	Map<Product,String>map=new HashMap<Product,String>();
//	
//	map.put(p1, "electronics");
//	map.put(p2, "abc");
//	for(Product p:map.keySet()) {
//		System.out.println(map.get(p));
//	}
 
}