
public class encap {
	private String name;
	public void setter(String n)
	{
		name=n;
	}
	public String getter()
	{
		return name;
	}
	public static void main(String[] args) {
		String a="Avar";
		encap ob=new encap();
		ob.setter(a);
		System.out.println(ob.getter());
	}
}
-