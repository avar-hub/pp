import java.io.*;
public class DeserializationPrac {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		stude ob=null;
		FileInputStream fin=new FileInputStream("/home/ctp/java prac/Serialization");
		ObjectInputStream in=new ObjectInputStream(fin);
		ob= (stude) in.readObject();
		in.close();
		fin.close();
		System.out.println(ob.age + " " + ob.name);
	}
}
