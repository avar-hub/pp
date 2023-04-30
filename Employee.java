
public abstract class Employee {
	private String name;
	private int paymentPerHour;
	Employee(String name,int paymentPerHour)
	{
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
	public abstract int calculateSalary();
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name=name;
	}
	public int getPaymentPerHour()
	{
		return paymentPerHour;
	}
	public void setPaymentPerHour()
	{
		this.paymentPerHour=paymentPerHour;
	}
}
class Contractor extends Employee
{
	private int workingHours;
	public Contractor() {
		super(name, paymentPerHour);
		this.workingHours=workingHours;
	}
	public int calculateSalary()
	{
		return getPaymentPerHour()*workingHours;
	}
}
class FullTimeEmployee extends Employee
{
	 FullTimeEmployee()
	 {
		 super(name, paymentPerHour);
	 }
	 public int calculateSalary()
	 {
		 return getPaymentPerHour()*8;
	 }
}
class Person
{
	private double id;
	private String nameString;
	Person()
	{
		id=Math.random();
		sayHello();
	}
	private void sayHello()
	{
		System.out.println("Hello - "+ getId());
	}
	public double getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.nameString=name;
	}
}
public class Abstraction
{
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("Avar");
		System.out.println("Person 1 - " + p1.getId() + " : " + p1.getName());
	}
}
