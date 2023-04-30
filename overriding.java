
class abc{
	void show()
	{
		System.out.println("hi am 1st");
	}
}
public class overriding extends abc
{
	void show()
	{
		super.show();
		System.out.println("i am second");
	}
	public static void main(String[] args) {
		abc ob=new abc();
		ob.show();
		overriding ob1=new overriding();
		ob1.show();
	}
	
	
}
