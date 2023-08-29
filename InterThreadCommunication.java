package synchronization;

class Accounts{
	int balance=20000;
	synchronized void withdraw(int amount) {
		System.out.println("Wants to withdraw"+amount+" Rs. ");
		
		if(balance<amount) {
			System.out.println("INSUFFIECIENT BALANCE");
			
			try {
				wait();
			}catch(Exception e) {
		}
		this.balance-=amount;
		System.out.println("WITHDRAW DONE");
	}
} 


	synchronized void deposit(int amount) {
		System.out.println(+amount+" will going to deposit ");
		this.balance+=amount;
		System.out.println("DEPOSIT DONE");
		notify();
	}
}
public class InterThreadCommunication {
	public static void main(String args[]) {
		Accounts a=new Accounts();
		
		new Thread() {
			public void run() {
				a.withdraw(30000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				a.deposit(30000);
			}
		}.start();
		
	}
}

