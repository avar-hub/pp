
public class ThreadPrac extends Thread{
	@Override
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() + " "+i);
		}
	}
	public static void main(String[] args) {
		ThreadPrac t=new ThreadPrac();
		t.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() + " "+i);
		}
		ThreadPrac t1=new ThreadPrac();
		t1.start();

	}
}
