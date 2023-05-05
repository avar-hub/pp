
public class DaemonThread extends Thread{
	public void run()
	{
			if(isDaemon())
				System.out.println(Thread.currentThread().getName()+ " Is a Daemon Thread");
			else 
				System.out.println("Not a Daemon Thread");
			
	}
	public static void main(String[] args) {
		DaemonThread dt=new DaemonThread();
		dt.setDaemon(true);
		
		dt.start();
		
	}
}
