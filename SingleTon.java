
class Abc
{
//	private static Object 
	private static Abc obj=new Abc();
//	private Constructor 
	private Abc(){
	}
	public static Abc getInstance()
	{
		return obj;
	}
}
public class SingleTon {
	public static void main(String[] args) {
		Abc ob=Abc.getInstance();
		Abc ob1=Abc.getInstance();
		System.out.println(ob.hashCode());
		System.out.println(ob1.hashCode());
	}
}
