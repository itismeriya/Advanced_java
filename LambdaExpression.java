package java8features;

//why we use lambda expression
//1) to provide the implementation of functional interface
//2) Less coding

interface Message
{
	//void msg();
	
	int add(int a, int b);
}


public class LambdaExpression{

	public static void main(String[] args) {
		//without lambda expression
//		Message s = new Message()
//		{
//			@Override
//			public void msg() {
//				System.out.println("Hello Java");
//			}
//		};
//		s.msg();
		
		//lambda expression
//		Message m = ()->{System.out.println("Hello World");};
//		m.msg();
		
		Message m = (a, b)->(a+b);
		System.out.println("Sum: "+m.add(10, 20));
		
		//with return type
		Message m1 = (int a, int b)->
		{
			return a+b;
		};
		System.out.println("Sum: "+m1.add(29, 30));
		

	}

}