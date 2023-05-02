
public class pracException {
	public static void main(String[] args) {
		int a=100,b=0,c;
		try {
		c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
		finally {
			System.out.println("finally");
		}
	}
}
