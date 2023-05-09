import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileRWAssin3TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter br = null;
		try {
			File f = new File("/home/ctp/java prac/assign4");
			f.createNewFile();
			File f1 = new File("/home/ctp/java prac/assign5");
			f1.createNewFile();
			File f2 = new File("/home/ctp/java prac/assign6");
			f2.createNewFile();
			System.out.println("Enter number of names");
			int num = sc.nextInt();
			System.out.println("write names");
			br = new BufferedWriter(new FileWriter("/home/ctp/java prac/assign4"));
			for (int i = 1; i <= num; i++) {
				String s = b.readLine();
				br.write(s);
				br.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		BufferedReader br1=null;
		BufferedWriter br2=null;
		BufferedWriter br3=null;
		try
		{
			
				br1=new BufferedReader(new FileReader("/home/ctp/java prac/assign4"));
				br2=new BufferedWriter(new FileWriter("/home/ctp/java prac/assign5"));
				br3=new BufferedWriter(new FileWriter("/home/ctp/java prac/assign6"));
				String str;	
				while((str=br1.readLine())!=null)
				{
					String arr[]=str.split(" ");
					System.out.println("First :"+arr[0]);
					System.out.println("Second :"+arr[1]);
					br2.write(arr[0]);
					br2.newLine();
					br3.write(arr[1]);
					br3.newLine();
				}
		}
		catch(IOException a)
		{
			a.printStackTrace();
		}
		finally
		{
			try {
					br1.close();
					br2.close();
					br3.close();
			}
			catch(IOException s)
			{
				s.printStackTrace();
			}
		}
				
	}
}
