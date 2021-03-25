import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class storeFrontMain 
{
	public static void main(String args[]) throws SQLException
	{	
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "storeFront1";
		String mysqlURL = url + dbName;
		String userId = "root";
		String pass = "2365";
		Connection con;
		Statement stmt;
		connection makeConnection =new connection();
		makeConnection.connectionMYSQL(mysqlURL, userId, pass);
		storeFrontJDBC store = new storeFrontJDBC();
		con = makeConnection.getConnection();
		stmt = makeConnection.getStatement();
		store.question1(1001,con,stmt);
		
		String images[] = {"C//desktop//a.jpg","D//new//k.jpge","E//bla//ll/jpg"};
		int productId[] = {8011,8031,5011};
		store.question2(images,productId,con,stmt);
		store.question3(con,stmt);
		
	}
}
