package synchronization;

public class GarbageCollectorDemo {
	public void finalize() {
		System.out.println("OBJECT IS GARBAGE COLLECTED");
	}

	public static void main(String[] args) {
		GarbageCollectorDemo obj1=new GarbageCollectorDemo();
		GarbageCollectorDemo obj2=new GarbageCollectorDemo();
		obj1=null;
		obj2=null;
		System.gc();

	}

}
