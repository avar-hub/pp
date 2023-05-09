import java.util.*;
public class LinkedListPrac {
	public static void main(String[] args) {
		List<Integer>ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
	
		List<Integer> ll2=new LinkedList<>();
		ll2.add(50);
		ll2.add(60);
		ll2.add(70);
		 
		ll.addAll(ll2);
		
		ll.remove(0);
		
		ll.removeAll(ll2);
	
		Iterator itr=ll.iterator();		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	
		
		
	}
}
