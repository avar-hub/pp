class abcd
{
	private String name;
	private int age;
	private static String company="Bonami Softwares";
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return age;
	}
	public String getcompany()
	{
		return company;
	}
	
}
public class POJO {
	public static void main(String[] args) {
		abcd obj=new abcd();
		obj.setname("Avar");
		obj.setage(21);
		System.out.println(obj.getname());
		System.out.println(obj.getage());
		System.out.println(obj.getcompany());
	}
}
