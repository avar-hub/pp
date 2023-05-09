import java.io.*;
public class FileOutputStreamPrac {
	public static void main(String[] args)throws IOException {
		FileOutputStream fout=new FileOutputStream("/home/ctp/java prac/FOSprac",true);
		String s="Avar Mittal";
		char ch[]=new char[20];
		ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			fout.write(ch[i]);
		}
		fout.close();
	}
}
