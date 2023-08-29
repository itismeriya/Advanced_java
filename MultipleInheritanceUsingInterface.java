package InterfaceReference;

//interface also makes .class
interface A
{
	int x=90;
	void fun();
}
//there can be multiple interface at a time
interface B
{
	int x=90;
	void msg();
}

class Multiple
{
	void say() 
	{
		System.out.println("yyyy");
	}
}

//class Imp1 extends Multiple implements A,B
class Impl implements A,B
{
	@Override
	public void fun() 
	{
		System.out.println("hiii");
	}
	
	public void msg() 
	{
		System.out.println("xxxx");
	}
}


//cannot do interface if different return type 

public class MultipleInheritanceUsingInterface 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Impl impl=new Impl();
		impl.fun();
		impl.msg();
	}
}