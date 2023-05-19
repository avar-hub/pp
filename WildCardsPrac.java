//import java.util.*;
//public class WildCardsPrac {
//	private static int add(ArrayList<? extends Number> list)
//	{
//		int sum=0;
//		for(Number n : list)
//			sum+=n.intValue();
//		return sum;
//	}
//	public static void main(String[] args) {
//		List<Integer> l=new ArrayList<>();
//		l.add(10);
//		l.add(20);
//		List<Double> l1=new ArrayList<>();
//		l1.add((double) 10);
//		l1.add(70);
//	}
//}
//private static int add(ArrayList<? extends Number> list)
//{
//	int sum=0;
//	for(Number n : list)
//		sum+=n.intValue();
//	return sum;
//}
//public static void main(String[] args) {
//	List<Integer> l=new ArrayList<>();
//	l.add(10);
//	l.add(20);
//	List<Double> l1=new ArrayList<>();
//	l1.add((double) 10);
//	l1.add(70);
//}
//}
import java.util.ArrayList;  
  
public class WildCardsPrac {  
  
      
    private static int add(ArrayList<? extends Number> num) {  
      
        int sum=0;  
          
        for(Number n:num)  
        {  
            sum = sum+n.intValue();  
        }  
          
        return sum;  
    }  
  
    public static void main(String[] args) {  
          
        ArrayList<Integer> l1=new ArrayList<Integer>();  
        l1.add(10);  
        l1.add(20);  
        System.out.println("displaying the sum= "+add(l1));  
          
        ArrayList<Double> l2=new ArrayList<Double>();  
        l2.add(30.0d);  
        l2.add(40.0d);  
        System.out.println("displaying the sum= "+add(l2));  
          
          
    }  
}
