
public class GenericMeathodPrac {
	public static <T>void 	print(T []arr)
	{
		for(T e : arr)
		{
				System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Integer a[]={10,20,30};
		String b[]= {"avar","abc"};	
		System.out.println("Integr array");
		print(a);
		System.out.println("String array");
		print(b);
	}
}
