import java.util.*;
public class LowerBoundWildCard {
	public static void print(List<? super Integer> l)
	{
		for(Object o : l)
			System.out.println(o);
	}
	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,2,3);
		System.out.println("Integer type");
		print(a);
		List<Number> a1	=Arrays.asList(1.0,2.3f,3.5f);
		System.out.println("Number type");
		print(a1);
	}
}
