import java.io.*;
import java.util.*;
public class FileRWAssignment {
	public static void main(String[] args) throws IOException{
		
		File f=new File("/home/ctp/java prac/assign");
		f.createNewFile();
		File f1=new File("/home/ctp/java prac/assign1");
		f1.createNewFile();
		File f2=new File("/home/ctp/java prac/assign2");
		f2.createNewFile();
		String s="Avar Mittal";
		BufferedWriter br=new BufferedWriter(new FileWriter("/home/ctp/java prac/assign"));
		br.write(s);
		br.close();
		BufferedReader br1=new BufferedReader(new FileReader("/home/ctp/java prac/assign"));
		String s1="";
		String temp[]=s.split(" ");
		String arr[]=new String[temp.length];
		while((s1=br1.readLine())!=null)
		{
			arr=s1.split(" ");
		}
		BufferedWriter br3=new BufferedWriter(new FileWriter("/home/ctp/java prac/assign1"));
		br3.write(arr[0]);
		br3.close();
		BufferedWriter br4=new BufferedWriter(new FileWriter("/home/ctp/java prac/assign2"));
		br4.write(arr[1]);	
		br4.close();
			
	}
}