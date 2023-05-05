
public class SingleTaskSingleThread extends Thread{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() + " "+ i);
		}
	}
	public static void main(String[] args) {
		SingleTaskSingleThread st=new SingleTaskSingleThread();
		st.start();
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() + " "+ i);
		}

	}
}
