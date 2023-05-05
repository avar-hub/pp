class Thread5 extends Thread {
	public void run() {
		// System.out.println(Thread.currentThread().getName()+" "+
		// Thread.currentThread().getPriority());
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i + " " + Thread.currentThread().getPriority());
		}
	}
}

class Thread6 extends Thread {
	public void run() {
		// System.out.println(Thread.currentThread().getName()+" "+
		// Thread.currentThread().getPriority());
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i + " " + Thread.currentThread().getPriority());
		}
	}
}

public class PriorityThreads {
	public static void main(String[] args) {
		Thread5 t1 = new Thread5();
		t1.setPriority(1);
		t1.start();
		Thread6 t2 = new Thread6();
		t2.setPriority(6);
		t2.start();
	}
}
