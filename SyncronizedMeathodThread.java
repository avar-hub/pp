class BookTheatreSeats 
{
	int tSeats=10;
	// It is Synchronized Meathod
	synchronized void bookSeats(int seats)
	{
		if(tSeats>=seats)
		{
			System.out.println(Thread.currentThread().getName()+"Booked");
			tSeats=tSeats-seats;
			System.out.println(tSeats +" Reamaining Seats");
		}
		else {
			System.out.println(Thread.currentThread().getName()+"Cannot book");
			System.out.println(tSeats+" Reamaining Seats");
		}
	}
}
	public class SyncronizedMeathodThread extends Thread{
		static BookTheatreSeats b;
		int seats;
		@Override
		public void run() {
			b.bookSeats(seats);
		}
		public static void main(String[] args) {
			b=new BookTheatreSeats();
			SyncronizedMeathodThread smt=new SyncronizedMeathodThread();
			smt.seats=7;
			smt.start();
			
			SyncronizedMeathodThread smt2=new SyncronizedMeathodThread();
			smt2.seats=8;
			smt2.start();
		}
	}

