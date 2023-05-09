import java.io.*;
import java.util.*;
public class FileRWAssign2 {

		public static void main(String[] args) throws IOException{
			Scanner sc=new Scanner(System.in);
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			File f=new File("/home/ctp/java prac/assign");
			f.createNewFile();
			File f1=new File("/home/ctp/java prac/assign1");
			f1.createNewFile();
			File f2=new File("/home/ctp/java prac/assign2");
			f2.createNewFile();
			System.out.println("Enter number of names");
			int num=sc.nextInt();
			System.out.println("write names");
			BufferedWriter br=new BufferedWriter(new FileWriter("/home/ctp/java prac/assign"));
			for(int i=1;i<=num;i++)
			{
				String s=b.readLine();
				 br.write(s);
				 br.newLine();
			}
			br.close();
			BufferedReader br1=new BufferedReader(new FileReader("/home/ctp/java prac/assign"));
			BufferedWriter br2=new BufferedWriter(new FileWriter("/home/ctp/java prac/assign1"));
			BufferedWriter br3=new BufferedWriter(new FileWriter("/home/ctp/java prac/assign2"));
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
			br1.close();
			br2.close();
			br3.close();
		} 
	}
			