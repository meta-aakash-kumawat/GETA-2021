import java.sql.SQLException;


public class storeFrontMain 
{
	public static void main(String args[]) throws SQLException
	{	
		storeFrontJDBC store = new storeFrontJDBC();
		store.connectionMYSQL();
		store.question1(1001);
		
		String images[] = {"C//desktop//a.jpg","D//new//k.jpge","E//bla//ll/jpg"};
		int productId[] = {8011,8031,5011};
		store.question2(images,productId);
		
	}
}
