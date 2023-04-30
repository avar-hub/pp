
interface I1
{
	void show();
	static void display()
	{
		System.out.println("I am static in interface");
	}
	default void dis()
	{
		System.out.println("I am default ininterface");
	}
}
public class inter implements I1{
	public void show()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		inter ob=new inter();
		ob.show();
		I1.display();
		ob.dis();
	}
	
}
