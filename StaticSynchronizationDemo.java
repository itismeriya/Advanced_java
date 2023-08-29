package synchronization;
class Product  //lock is associated with class
{
	synchronized static  void printProduct(int n)
	{
		for(int i=1; i<=n; i++)
		{
			System.out.println("Thread: "+Thread.currentThread().getName()+": "+n*i);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

public class StaticSynchronizationDemo 
{
	public static void main(String[] args)
	{
		//Product p1 = new Product(); //lock is associated with object p1
		//Product p2 = new Product(); //lock is associated with object p1
		new Thread("t1")
		{
			public void run()
			{
				Product.printProduct(5);
			}
		}.start();
		
		new Thread("t2")
		{
			public void run()
			{
				Product.printProduct(6);
			}
		}.start();
		
		new Thread("t3")
		{
			public void run()
			{
				Product.printProduct(8);
			}
		}.start();
		
		new Thread("t4")
		{
			public void run()
			{
				Product.printProduct(10);
			}
		}.start();
	}
}