import java.io.*;
public class SerializationPrac {
	public static void main(String[] args) throws IOException{
		stude s=new stude();
		s.age=21;
		s.name="avar";
		FileOutputStream fout=new FileOutputStream("/home/ctp/java prac/Serialization");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s);
		out.close();
		fout.close();
		System.out.println("Saved in Serializablr file");
	}
}	
