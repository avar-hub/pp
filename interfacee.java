interface i
{
	void show(); //abstract meathod
	default void disp()
	{
		System.out.println("Hey i am default");
	}
	static void disp(String ss)
	{
		System.out.println("hi i am static");
	}
	
}
public class interfacee implements i {
	public void show() // access modifier greater that the inherited ones
	{
		System.out.println("Abstract meathod in inheritance");
	}
	public static void main(String[] args) {
		interfacee ob=new interfacee();
		ob.disp();
		i.disp("abc");
	}
}
