package helper;
import java.sql.Connection;

import java.sql.DriverManager;
import java.util.*;

public class ConectionProvider {
public  static Connection con;
public static Connection getConnection()
{
	try {
		if(con==null)
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Akshata00#");
		}
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	System.out.println("con helper="+con);
	return con;
}

}
