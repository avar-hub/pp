import java.util.Scanner;


class AgeException extends RuntimeException
{
	public AgeException(String msg) {
		super(msg);
	}
}
public class pracException2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter age");
		int age=scanner.nextInt();
		if(age<18)
		{
			try {
				throw new AgeException("hii");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("prog runned ");
		}
		else {
			System.out.println("yes ");
		}
	}
	
}
