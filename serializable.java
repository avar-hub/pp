import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serializable {
	public static void main(String[] args) {
		emp e = new emp();
		e.name = "Avar";
		e.add = "ddun";
		try {
			FileOutputStream fout = new FileOutputStream("/home/ctp/Desktop/aa.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(e);
			out.close();
			fout.close();
			System.out.println("Serialized data stored in aa.txt");
		} catch (IOException ep) {
			ep.printStackTrace();
		}
	}
}
