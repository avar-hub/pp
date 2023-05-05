

public class SingleTaskMultipleThreads extends Thread{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		SingleTaskMultipleThreads st=new SingleTaskMultipleThreads();
		st.start();
		SingleTaskMultipleThreads st2=new SingleTaskMultipleThreads();
		st2.start();
		SingleTaskMultipleThreads st3=new SingleTaskMultipleThreads();
		st3.start();
	}
}
