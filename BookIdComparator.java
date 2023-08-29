package collectionDemo;
import java.util.Comparator;
//non-generic-where we are not specifying any type
public class BookIdComparator implements Comparator<Book>{
	
		//non generic where you do not need to type cast the object
		@Override 
		public int compare(Book o1,Book o2) {
			if(o1.bookId==o2.bookId)
				return 0;
			else if(o1.bookId>o2.bookId)
				return 1;	//swap
			else
				return -1;
	}
	
//	//non generic where you need to type cast
//	@Override
//	public int compare(Object o1,Object o2) {
//		Book b1=(Book)o1;
//		Book b2=(Book)o2;
//			return 0;
//}
}
