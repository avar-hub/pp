import java.util.*;
public class FailFast {
	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(1,2,3,4);
		Iterator itr= arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			arr.add(1);
		}
		
	}
}
