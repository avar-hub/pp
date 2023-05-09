import java.io.*;
public class FINPrac  {
	public static void main(String[] args) throws IOException{
		File f=new File("/home/ctp/java prac/FOSprac.txt");
		f.createNewFile();
		FileInputStream fin=new FileInputStream(f);
		int i;
//		do
//		{
//			i=fin.read();
//			if(i!=-1)
//				System.out.println((char)i);
//		}
//		while(i!=-1);
		while((i=fin.read()) !=-1) {
			System.out.println((char)i);
		}
		
		fin.close();
		System.out.println("yea task completed");
	}
}
