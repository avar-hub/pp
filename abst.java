abstract class Vehicle
{
	int no_of_tyres;
	abstract void start();
}
class car extends Vehicle{
	void start()
	{
		System.out.println("Start with key");
	}
}
class scooter extends Vehicle
{
	void start()
	{
		System.out.println("Start with kick");
	}
}
public class abst
{
	public static void main(String[] args) {
		scooter sc=new scooter();
		sc.start();
		car car=new car();
		car.start();
	}
}