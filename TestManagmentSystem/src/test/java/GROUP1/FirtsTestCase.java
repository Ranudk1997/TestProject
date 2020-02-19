package GROUP1;
import java.sql.DriverManager;
import java.sql.*;
import org.junit.jupiter.api.Assertions;
import  org.junit.jupiter.api.Test;
public class FirtsTestCase {
	@Test
	public void  checking()
	{
		
		Assertions.assertNotNull(GetConnect.getConnection());
	}
	
	
	@Test
	public void  checking1()
	{
		Loading s=new Loading();
		s.sname="hello";
		s.age=20;
		
		Assertions.assertEquals(s.sname,"hello");
		
	}
	
	

}
