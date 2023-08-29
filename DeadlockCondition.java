package synchronization;



public class DeadlockCondition {
	
		public static void main(String args[]) {
			final String pen="pen";
			final String paper="paper";
			
			Thread koyel=new Thread() {
				public void run() {
					synchronized(pen){
						System.out.println("Koyel locked pen");
					
						try {Thread.sleep(200);
						}catch(Exception e) {}
					
				
					synchronized(paper){
					System.out.println("Koyel wants to lock paper");
				}
			}
			}
		};
		
		Thread monalisa=new Thread() {
			public void run() {
				synchronized(paper){
					System.out.println("Monalisa locked paper");
					
				try {Thread.sleep(200);
				}catch(Exception e) {}
				
				synchronized(pen){
					System.out.println("Monalisa wants to lock pen");
				}
			}
			}
		};
		
		koyel.start();
		monalisa.start();
		}
	}

