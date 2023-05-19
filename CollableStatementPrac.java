import java.sql.*;
public class CollableStatementPrac {
	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/avar","avar","software");
		CallableStatement callableStatement=connection.prepareCall("{call proc}");
		
		connection.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
	