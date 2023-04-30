
public class overloading {
	public void show(Object d)
	{
		System.out.println("hi i am object");
	}
	public void show()
	{
		System.out.println("heya");
	}
	public void show(int a)
	{
		System.out.println("hi");
	}
	public void show(int... a)
	{
		System.out.println("hi am varargs");
	}
	public static void main(int b) {
		System.out.println("i am main overloading");
	}
	public static void main(String[] args) {
		overloading ob=new overloading();
		ob.show();
		ob.show(10);
		ob.show('a');// automatic promotion
		ob.show(ob);
		ob.main(10);
		ob.show(10,20,30);
	}
}
