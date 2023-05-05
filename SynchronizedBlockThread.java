class BookSeats 
{
	int tSeats=10;
	public void book(int seats)
	{
		synchronized (this) {
			if(tSeats>=seats)
			{
				System.out.println(Thread.currentThread().getName()+" Booked");
				tSeats=tSeats-seats;
				System.out.println(tSeats+" Reamining Seats");
			}
			else {
				System.out.println("Cannot Book Remaining Seats"+ tSeats);
			}
		}
		
	}
}
public class SynchronizedBlockThread extends Thread{
	static BookSeats b;
	int seats;
	@Override
	public void run()
	{
		b.book(seats);
	}
	public static void main(String[] args) {
		b=new BookSeats();
		SynchronizedBlockThread sbt=new SynchronizedBlockThread();
		sbt.seats=7;
		sbt.start();
		
		SynchronizedBlockThread sbt2=new SynchronizedBlockThread();
		sbt2.seats=7;
		sbt2.start();
	}
}
