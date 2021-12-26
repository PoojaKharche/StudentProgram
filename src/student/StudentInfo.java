package student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInfo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");		
		System.out.println(" driver loaded... ");		
		
		String url="jdbc:oracle:thin:@DESKTOP-U1OF0AB:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "hr","hr");
	
		System.out.println("Connected successfully .... ");
		
		Statement st=con.createStatement();
		
		ResultSet rs = st.executeQuery("select *  from STUDENT");
		while(rs.next())
		{	  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getDate(3)+" "+rs.getDate(4));
		}
		rs.close();
	}

}
