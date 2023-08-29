package InterfaceReference;


//interface inherit interface
//class implement Interface

interface A1
{
	void fun();
}

interface B1 extends A1
{
	int x=34;
	void method1();
  //void say();
}

interface C1 extends A1
{
	int x=90;
	void method2();
  //int say();
}

class D1 implements B1,C1
{
	@Override
	public void fun() 
	{
		System.out.println("hiii");
	}
	
	public void method1() 
	{
		System.out.println("ccc");
	}
	
	public void method2() 
	{
		System.out.println("vvvv");
	}
}
public class MultipleInheritanceUsingInterface1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		D1 obj=new D1();
		obj.fun();
		obj.method1();
		obj.method2();
      //if we have same variable name in two interfaces, then we just need to call by interfacename.var        
		System.out.println(C1.x);
	}
}