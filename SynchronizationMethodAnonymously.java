package synchronization;

//shared resource
class Factorial
{
	void fact(int n)
	{
		System.out.println("We are learning synchronized block.");
		synchronized(this)
		{
			int f=1;
			for(int i=1;i<=n;i++)
			{
				f=f*i;
				System.out.println("Thread: "+Thread.currentThread().getName()+": "+f);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			System.out.println("Factorial of "+n+" is:"+f);
		} //end of synchronized block
		
		System.out.println("End of synchronized block.");
	}
}

public class SynchronizationMethodAnonymously 
{
	public static void main(String[] args)
	{
		final Factorial fact=new Factorial(); //only one lock is associated with the object
		new Thread()
		{
			public void run()
			{
				fact.fact(5);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				fact.fact(10);
			}
		}.start();
	};
}