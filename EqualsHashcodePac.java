import java.io.*;

class worker
{
	String name;
	int id;
	worker(String name,int id)
	{
		this.name=name;
		this.id=id;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || obj.getClass()!=this.getClass())
			return	false;
		worker w=(worker)obj;
		return (w.name==this.name && w.id==this.id);
	}
}
public class EqualsHashcodePac {	
	public static void main(String[] args) {
		worker w1=new worker("avar",1);
		worker w2=new worker("avar",1);
		if(w1.hashCode()==w2.hashCode())
		{
			if(w1.equals(w1))
				System.out.println("Both are equal");
			else
				System.out.println("Not equal");
		}
		else {
			System.out.println("Hashcode is not equal");
		}
	}
}
