

public class ThreadPracRunnable implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " " + i);
		}
	}
	public static void main(String[] args) {
		ThreadPracRunnable t=new ThreadPracRunnable();
		Thread th=new Thread(t);
		th.start();
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " " + i);
		}
	}
}
