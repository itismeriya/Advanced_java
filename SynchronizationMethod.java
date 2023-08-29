package synchronization;

class Factorial1
{
	void fact(int n)
	{
		System.out.println("We are learning synchronized block.");
		synchronized(this) 
		{
			long fact = 1;
			for(int i = 1; i<=n; i++)
			{
				fact = fact*i;
				System.out.println("Thread : "+Thread.currentThread().getName()+" "+fact);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			System.out.println("Factorial of "+n+" is : "+fact);
		}//end of synchronized block
		    
		System.out.println("End of synchronized block.");
	}
}

class Thread1 extends Thread
{
	Factorial1 f;
	public Thread1(Factorial1 f)
	{
		this.f=f;
	}
	public void run()
	{
		f.fact(5);
	}
}

class Thread2 extends Thread
{
	Factorial1 f;
	public Thread2(Factorial1 f)
	{
		this.f=f;
	}
	public void run()
	{
		f.fact(10);
	}
}
	
public class SynchronizationMethod
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			
		Factorial1 fact = new Factorial1(); //only one lock is associated with the object
		Thread1 t1 = new Thread1(fact);
		Thread2 t2 = new Thread2(fact);
		t1.start();
		t2.start();
	}
}
