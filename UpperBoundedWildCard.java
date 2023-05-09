import java.util.*;
public class UpperBoundedWildCard {
	public static void print(List<? extends Number> l)
	{
			for(Object o : l)
		{
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3);
		print(l);
		List<Float> d=Arrays.asList(1.5f,2.6f);
		print(d);
	}
}

