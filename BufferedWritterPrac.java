import java.io.*;
public class BufferedWritterPrac {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw=new BufferedWriter(new FileWriter("/home/ctp/java prac/FOSprac.txt",true));
		bw.write("is a good boy");
		bw.close();
		
	}
}
