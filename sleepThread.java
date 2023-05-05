
public class sleepThread extends Thread {
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
				System.out.println(e);
			}
		}
	}
public static void main(String[] args) {
	sleepThread st=new sleepThread();
	st.start();
}
}
