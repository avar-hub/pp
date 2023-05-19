import java.sql.*;
public class PreparedStatemntPrac {


		public static void main(String[] args) {
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/avar","avar","software");
				Statement statement=connection.createStatement();
				PreparedStatement preparedStatement=connection.prepareStatement("Insert into a values(?)");
				System.out.println("Query Running");
				String str="Insert into a values(30)";
				String str2="Insert into a values(31)";
				String str3="Insert into a values(32)";


				preparedStatement.setInt(1,45);
				preparedStatement.executeUpdate();
				preparedStatement.setInt(1,199);
//				statement.execute(str);
//				statement.execute(str2);
//				statement.execute(str3);
				preparedStatement.executeUpdate();
				//preparedStatement.execute();
				connection.close();
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		}
}
