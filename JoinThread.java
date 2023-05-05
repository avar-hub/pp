
public class JoinThread extends Thread{

	public void run()
	{
		for(int i=0;i<3;i++)
		{
		System.out.println(Thread.currentThread().getName()+" In control");
		}
	}
	public static void main(String[] args) {
		YeildThread yt1=new YeildThread();
		YeildThread yt2=new YeildThread();
		yt1.start();
		yt2.start();
		try
		{
			yt1.join();
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
	}
}


