import java.io.*;
public class BufferedReaderprac {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("/home/ctp/java prac/FOSprac.txt"));
		int c;
		while( (c=br.read()) !=-1)
		{
			
			System.out.println((char)c);
		}
		br.close();
	}
}







































