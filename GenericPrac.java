class Box<T>
{
	T obj;
//	public Box() {
//		this.container=container;
//	}
	void add(T obj)
	{
		this.obj=obj;
	}
	public T show()
	{
		return obj;
	}
}
public class GenericPrac {
	public static void main(String[] args) {
		Box<String> s=new Box<String>();
		s.add("Avar");
		System.out.println(s.show());
		
	}
}
