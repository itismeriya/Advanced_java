package java8features;

//a functional interface can only contain one abstract method but any number of
//Object class methods. It is also known as SAM (Single Abstract Method) Interface.
@FunctionalInterface
interface Sayable
{
	void msg(); //abstract methods
	
	//default method in interface can have method body
	default void say()
	{
		System.out.println("Hello");
	}
	
	//it can contain any number of Object class methods
	int hashCode();
	String toString();
	boolean equals(Object obj);
}


public class FunctionalInterfaceDemo implements Sayable{

	@Override
	public void msg() {
		System.out.println("We are learning functional interface");
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceDemo fid = new FunctionalInterfaceDemo();
		
		fid.msg();
		fid.say();

	}

	

}