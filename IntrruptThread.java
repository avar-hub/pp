
public class IntrruptThread extends Thread {
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			
			System.out.println(i);
			try
			{
			
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Intrrupted");
			}
		}
	}
	public static void main(String[] args) {
	IntrruptThread th=new IntrruptThread();
	th.start();
	th.interrupt();
		}
}

