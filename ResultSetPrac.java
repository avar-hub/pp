//import java.sql.*;
//public class ResultSetPrac {
//	public static void main(String[] args) {
//		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/avar","avar","software");
//		Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//		ResultSet rs=st.executeQuery("Select * from a");
//		rs.next();
//		System.out.println(rs.getInt(1));
//		conn.close();
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//	}
//}
//import java.sql.*;
//class ResultSetPrac
//{
//	public static void main(String[] args) {
//		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/avar","avar","software");
//		Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//		ResultSet rs=st.executeQuery("Select * from a");
//		//while(rs.next())
//		rs.next();
//		System.out.println(rs.getString(1));
//		conn.close();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//}
import java.util.*;
import java.sql.*;
import java.util.ArrayList;
class ResultSetPrac
{
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/avar","avar","software");
		Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=statement.executeQuery("Select * from a");
		rs.next();
		System.out.println(rs.getInt(1));
		connection.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
