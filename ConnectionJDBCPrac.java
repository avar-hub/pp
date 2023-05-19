//import java.sql.*;
//public class ConnectionJDBCPrac {
//	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/avar","avar","software");
//			Statement smt=conn.createStatement();
//			System.out.println("Inserting records");
//			String sql="Insert into connPrac values('avar',21)";
//			smt.execute(sql);
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//}
import java.sql.*;
public class ConnectionJDBCPrac {
	public static void main(String[] args)  {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/avar","avar","software");
		Statement st=conn.createStatement();
		System.out.println("Query running");
		String str="Create table a(num int)";
		String str2="Insert into a values(21)";
		String str3="Insert into a values(22)";
//		st.execute(str);
		st.execute(str2);
		st.execute(str3);
		conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

