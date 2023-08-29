package synchronization;

public class Restaurant {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer=new Customer();
		Cook cook = new Cook();
		Waiter waiter = new Waiter();
		
		
		
		Thread t1 = new Thread(new Runnable() {
           
            public void run() {
                customer.placeOrder();
            }
        });

        Thread t2 = new Thread(new Runnable() {
           
            public void run() {
                cook.prepareFood();
            }
        });

        Thread t3 = new Thread(new Runnable() {
           
            public void run() {
                waiter.deliverFood();
            }
        });

        
        
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();

	}

}



class Customer {
    public void placeOrder() {
        System.out.println("Customer is placing an order.....");
    }

    
}

class Cook {
    public void prepareFood() {
        System.out.println("Cook is preparing food........");
    }

    
}

class Waiter {
    public void deliverFood() {
        System.out.println("Waiter is delivering food.......");
    }

   
}