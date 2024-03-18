package JDBS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Collections;

public class Jdbs_Connection_class {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet resultset=null;
		PreparedStatement statement=null;
		Connection connections=null;
		
		String url="jdbc:mysql://192.168.0.102/jaswanth_project";
		String UserName="root";
		String Password="root";
		String query="insert into STUDENT_INFO(FIRSTNAME,LASTNAME,MOBILENUMBER,EMAILID,GENDER)"
				+"VALUES(?,?,?,?,?)";
		try {
			connections=DriverManager.getConnection(url, UserName, Password);
			statement=connections.prepareStatement(query);
			statement.setString(1,"jaswanth");
			statement.setString(2,"Aluri");
			statement.setLong(3,7288807486L);
			statement.setString(4,"alurijaswanth@gmail.com");
			statement.setBoolean(5,true);
			int no=statement.executeUpdate();
			System.out.println(no);
//			resultset=statement.executeQuery(query);
//			while(resultset.next())
//			{
//				System.out.println(resultset.getString("FIRSTNAME"));
//			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			connections.close();
			statement.close();
			//resultset.close();
		}
		

	}

}
