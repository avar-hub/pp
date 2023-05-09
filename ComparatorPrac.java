import java.util.*;
class s
{
	String name;
	int age;
	s(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class ComparatorPrac
{
	public static void main(String[] args) {
		List<s> l=new ArrayList<s>();
		l.add(new s("avar",21));
		l.add(new s("akshay",22));
		l.add(new s("aman",20));
		l.add(new s("tanul",19));
		Comparator<s> com=(i,j)-> i.age>j.age?1:-1;
		Collections.sort(l,com);
		for(s i:l)
		{
			System.out.println(i.name + " " + i.age);
		}
	}
}