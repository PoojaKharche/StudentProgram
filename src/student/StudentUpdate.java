package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{


		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@DESKTOP-U1OF0AB:1521:XE";
		Connection con = DriverManager.getConnection(url, "hr","hr");
		System.out.println("connected successfully .... ");
		
		Statement st= con.createStatement();
		int p=st.executeUpdate("Update STUDENT set STUDENT_DOJ='14/01/2021' where STUDENT_NO=203");
		System.out.println(p+" row updated  ");
		

    }
}
