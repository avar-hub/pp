import java.io.File;
import java.io.IOException;
public class FileClassPrac {
public static void main(String[] args) throws IOException{
	File f=new File("/home/ctp/java prac/FileHandling.txt");
	
	f.createNewFile();
	
	System.out.println("File Existed: " + f.exists());
	
	System.out.println("File name: "+f.getName());
	
	System.out.println(f.canWrite());
	
	f.delete();
	System.out.println("File Existed: " + f.exists());
}
}
