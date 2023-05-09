import java.util.*;

class Student
{
	int age;
	String name;
	public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
}
public class ListPrac {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		List<Integer> l=new ArrayList<>();
//		System.out.println("Enter elements in list");
//		for(int i=0;i<10;i++)
//		{
//			l.add(sc.nextInt());
//		}
//		
//		l.set(0,100);
//		
//		Collections.sort(l);
//		
//		
//		Iterator itr=l.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		List<Student> l2=new ArrayList<>();
		Student s1=new Student(21,"Avar");
		Student s2=new Student(22,"abc");
		l2.add(s1);
		l2.add(s2);
		List<Student> l3=new ArrayList<>();
		Student s4=new Student(21,"Ashok");
		Student s5=new Student(22,"ttt");
		l3.add(s4);
		l3.add(s5);
		
		l2.addAll(l3);
		//l2.removeAll(l3);
		l2.retainAll(l3);
		
		Iterator<Student> itr2=l2.iterator();
		while(itr2.hasNext())
		{
			Student st=itr2.next();
			System.out.println(st.age + " " + st.name);
		}
		System.out.println(l2.isEmpty());
		System.out.println(l2.size()		);
	}
}
