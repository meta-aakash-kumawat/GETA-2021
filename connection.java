import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class connection 
{
	Connection con;
	Statement stmt;
	ResultSet rst;
	public void connectionMYSQL(String mysqlURL, String userId, String pass)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(mysqlURL,userId,pass);
			stmt = con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public Connection getConnection()
	{
		return this.con;
	}
	public Statement getStatement()
	{
		return this.stmt;
	}
}

