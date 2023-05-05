
public class YeildThread extends Thread{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
		System.out.println(Thread.currentThread().getName()+" In control");
		}
	}
	public static void main(String[] args) {
		YeildThread yt1=new YeildThread();
		yt1.start();
		for(int i=0;i<3;i++)
		{
			yt1.yield();
			System.out.println(Thread.currentThread().getName()+" In control");
		}
		
	}
}
