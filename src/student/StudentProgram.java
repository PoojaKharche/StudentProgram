package student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class StudentProgram {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");		
		System.out.println(" driver loaded... ");		
		
		String url="jdbc:oracle:thin:@DESKTOP-U1OF0AB:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "hr","hr");
	
		System.out.println("Connected successfully .... ");
		
		Statement st=con.createStatement();
		
		/*  create table STUDENT(STUDENT_NO number,STUDENT_NAME varchar2(20),STUDENT_DOB DATE,STUDENT_DOJ DATE);
		    insert into STUDENT values(201,'Kimaya','12/10/1997','14/03/2020');
 			insert into STUDENT values(202,'maya','20/08/1996','15/04/2017');
 			insert into STUDENT values(203,'pooja','15/09/1996','28/12/2021');
 			insert into STUDENT values(204,'Harshal','25/12/1991','15/05/2015');
 			insert into STUDENT values(205,'Krisha','19/02/1194','12/07/2019');
 			commit;		   
		*/		

		ResultSet rs2 = st.executeQuery("select STUDENT_NO,STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ from STUDENT");		
		while(rs2.next())
		{	  
			System.out.println(rs2.getInt(1)+"  "+" "+rs2.getString(2)+" "+rs2.getDate(3)+" "+rs2.getDate(4));
			
		}
		
    }
	}


