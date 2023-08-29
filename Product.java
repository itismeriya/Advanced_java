package collectionDemo;

import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString

public class Product extends Object {
 int id;
 String name;
 
 
// @Override
 public boolean equals(Object obj) {
	 
	 //if both the object refrence are same
	 if(this==obj)
		 return true;
	 
	 //check if arg null or both obj from different class
	 if(obj==null || this.getClass()!=obj.getClass())
		 return false;
//	 
	 //compare the states of the objects
	 Product p=(Product) obj;
	 return(p.id==this.id) && p.name.equals(this.name);
 }
 @Override
 public int hashCode() {
	 return (this.name.length()*10)%2;
	
 }

}