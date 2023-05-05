class Thread1 extends Thread
{
	@Override
	public void run()
	{
		 for(int i=0;i<5;i++)
		 {
			 System.out.println(Thread.currentThread().getName()+" "+i);
		 }
	}
}
class Thread2 extends Thread
{
	@Override
	public void run()
	{
		 for(int i=20;i<25;i++)
		 {
			 System.out.println(Thread.currentThread().getName()+" "+i);
		 }
	}
}
public class MultipleTaskMultipleThread{
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread1 t3=new Thread1();
		t1.start();
		t3.start();
		Thread2 t2=new Thread2();
		Thread2 t4=new Thread2();
		t2.start();
		t4.start();

		
	}
}
