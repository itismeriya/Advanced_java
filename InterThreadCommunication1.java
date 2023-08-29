package synchronization;

class BankAccounts{
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
	synchronized void checkBalance() {
		try {
			wait();
		}catch(Exception e) {
	}
	System.out.println("BALANCE: "+this.balance);
}

	synchronized void deposit(int amount) {
		System.out.println(+amount+" will going to deposit ");
		this.balance+=amount;
		System.out.println("DEPOSIT DONE");
		notifyAll();
	}
}

public class InterThreadCommunication1 {
	public static void main(String args[]) {
		BankAccounts ba=new BankAccounts();
		
		new Thread() {
			public void run() {
				ba.withdraw(30000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				ba.checkBalance();
			}
		}.start();
		
		new Thread() {
			public void run() {
				ba.deposit(30000);
			}
		}.start();
		
	}
}

