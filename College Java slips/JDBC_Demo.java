import java.sql.*;
import java.io.*;
import java.lang.*;

public class JDBC_Demo
{
	public static void main(String a[])
	{
		try{
			Connection con;
			Statement stmt;
			ResultSet rs;

			Class.forName("oracle.jdbc.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","lol");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from emp");
			while(rs.next())
				{
					System.out.println(" Emp Id:"+rs.getInt(1)+"\nEmp Name: "+rs.getString(2)+"\nSalary: "+rs.getInt(3));
				}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
				}

	}
}