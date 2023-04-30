

class parent
{
	public void disp()
	{
		System.out.println("Hi i am parent class");
	}
}
class child extends parent{
	void disp1() {
		System.out.println("hi am child");
	}
}
public class inherit extends child{
	public static void main(String[] args) {
		inherit ob=new inherit();
		ob.disp();
		ob.disp1();
	}
}
