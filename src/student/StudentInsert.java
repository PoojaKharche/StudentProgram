package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");		
		System.out.println(" driver loaded... ");		
		
		String url="jdbc:oracle:thin:@DESKTOP-U1OF0AB:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "hr","hr");
	
		System.out.println("Connected successfully .... ");
		
		Statement st=con.createStatement();

		int n=st.executeUpdate("Insert into STUDENT values(201,'Kimaya','12/10/1997','14/03/2020')");
		int n1=st.executeUpdate("Insert into STUDENT values(202,'maya','20/08/1996','15/04/2017')");
		int n2=st.executeUpdate("Insert into STUDENT values(203,'pooja','15/09/1996','28/12/2021')");
		int n3=st.executeUpdate("Insert into STUDENT values(204,'Harshal','25/12/1991','15/05/2015')");
		int n4=st.executeUpdate("Insert into STUDENT values(205,'Krisha','19/02/1194','12/07/2019')");
		System.out.println(n+" row inserted ");
		System.out.println(n1+" row inserted ");
		System.out.println(n2+" row inserted ");
		System.out.println(n3+" row inserted ");
		System.out.println(n4+" row inserted ");
		

	}

}
