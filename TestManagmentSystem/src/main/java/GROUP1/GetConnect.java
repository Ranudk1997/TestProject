package GROUP1;
import java.sql.*;
public class GetConnect {
	
	public  static Connection conn=null;
	
	public  static  Connection  getConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system", "123456789");
		}
		catch(Exception e) { e.printStackTrace();}
		return  conn;
	}
 
}
