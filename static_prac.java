
public class static_prac {
	static String clg="gehu";
	int c;
	String n;
	static_prac(String n,int c) {
		this.n=n;
		this.c=c;
	}
	public void display()
	{
		System.out.println(n+ " "+ c + " "+ clg);
	}
   public static void main(String[] args) {
	   static_prac ob1=new static_prac("Avar", 10);	
	   ob1.display();
	   static_prac ob2=new static_prac("aman", 20);
	   ob2.display();
	   
   }
}