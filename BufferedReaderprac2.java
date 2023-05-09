import java.io.*;
public class BufferedReaderprac2  {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("/home/ctp/java prac/FOSprac.txt"));
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		br.close();
	}
}
