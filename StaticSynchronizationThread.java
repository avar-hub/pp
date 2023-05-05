class BookSeatss
{
	static int tSeats=20;;
	static synchronized public void book(int seats)
	{
		if(tSeats>=seats)
		{
			System.out.println(Thread.currentThread().getName()+" Booked");
			tSeats=tSeats-seats;
			System.out.println("Remaining Seats  " + tSeats);
		}
		else {
			System.out.println("Cannot Book  : Reamining Seats :  " + tSeats);
		}
	}
}
class Thread11 extends Thread{
	BookSeatss b;
	int seats;
	public Thread11(BookSeatss b,int seats) 
	{
		this.b=b;
		this.seats=seats;
	}
	@Override
	public void run() {
		b.book(seats);
	}
}
class Thread22 extends Thread{
	BookSeatss b;
	int seats;
	public Thread22(BookSeatss b,int seats) 
	{
		this.b=b;
		this.seats=seats;
	}
	@Override
	public void run() {
		b.book(seats);
	}
}
public class StaticSynchronizationThread {
	public static void main(String[] args) {
		StaticSynchronizationThread sst=new StaticSynchronizationThread();
		BookSeatss b1=new BookSeatss();
		Thread22 th2=new Thread22(b1, 7);
		Thread11 th3=new Thread11(b1, 7);
		th2.start();
		th3.start();
		BookSeatss b2=new BookSeatss();
		Thread22 th4=new Thread22(b1, 7);
		Thread11 th5=new Thread11(b2,7);
		th4.start();
		th5.start();
		
		
	}
}
