import java.io.*;
public class BufferedReaderprac3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("/home/ctp/java prac/FOSprac.txt"));
		char ch[]=new char[20];
		br.read(ch,0,19);
		System.out.println(ch);
		br.close();
	}
}
