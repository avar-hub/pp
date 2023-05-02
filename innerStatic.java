
public class innerStatic {
	private static String s="Avar";
	public void show()
	{
		System.out.println("Outer class");
	}
	public static class s
	{
		public void show()
		{
			System.out.println("inner class");
		}
	}
	public static void main(String[] args) {
		innerStatic obj1=new innerStatic();
		innerStatic.s obj=new innerStatic.s();
		obj1.show();
		obj.show();
		
	}
}
