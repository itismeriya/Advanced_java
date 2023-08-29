package collectionDemo;
import java.util.ArrayList;
import java.util.Collections;
public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Book> books=new ArrayList<Book>();
		books.add(new Book(3,"let us C",500));
		books.add(new Book(1,"DS with JAVA",900));
		books.add(new Book(2,"sad",400));
		books.add(new Book(4,"Ds using C",700));
		
		System.out.println("before sorting");
		for(Book b1:books) {
			System.out.println(b1);
		}
		
		System.out.println("sorting by id");
		Collections.sort(books,new BookIdComparator());
		
		for(Book b1:books) {
			System.out.println(b1);
		}
		
		System.out.println("sorting by id");
		Collections.sort(books,new NameComparator());
		
		for(Book b1:books) {
			System.out.println(b1);
		}

	}
}
