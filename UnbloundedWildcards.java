
import java.util.*	;
public class UnbloundedWildcards {
	public static void print(List<?>l)
	{
		for(Object o: l)
			System.out.println(o);
	}
	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,2,3);
		System.out.println("disp integer value");
		print(a);
		List<String> b=Arrays.asList("avar","mittal");
		System.out.println("disp string value");
		print(b);
	}
}
