import java.sql.*;
import java.io.*;
public class ConnectivityJDBCPRAC2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/avar","avar","software");
			PreparedStatement preparedStatement=connection.prepareStatement("Insert into a values(?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
			do
				{
					System.out.println("Enter number");
					int a=Integer.parseInt(br.readLine());
					preparedStatement.setInt(1,a);
					preparedStatement.executeUpdate();
					System.out.println("Do you want to enter more? : Y or N");
					String s=br.readLine();
					if(s.equalsIgnoreCase("N"))
						break;
				}
			while(true);
			connection.close();
			}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

