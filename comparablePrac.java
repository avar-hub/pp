import java.util.*;
class sss implements Comparable<sss>
{
	@Override
	public int compareTo(sss that)
	{
		if(this.age>that.age)
			return 1;
		else 
			return-1;
		
	}
	String name;
	int age;
	sss(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}

public class comparablePrac {
	public static void main(String[] args) {
		List<sss> ll=new ArrayList<>();
		ll.add(new sss("avar",21));
		ll.add(new sss("av",10));
		ll.add(new sss("ar",11));
		ll.add(new sss("a",19));
		Collections.sort(ll);
		for(sss i : ll)
				System.out.println(i.name + " " + i.age);
	}
}
