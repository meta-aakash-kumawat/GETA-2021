import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class storeFrontJDBC 
{
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "storeFront1";
	String mysqlURL = url + dbName;
	String userId = "root";
	String pass = "2365";
	Connection con;
	Statement stmt;
	ResultSet rst;
	public void connectionMYSQL()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(mysqlURL,userId,pass);
			stmt = con.createStatement();
			rst = stmt.executeQuery("SELECT * FROM USER");
			while(rst.next())
			{
				System.out.println(rst.getInt(1)+"   "+rst.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void question1(int userId) throws SQLException
	{
		String query = "select orderId,orderDate,sum(price) "
						+ "from orderDetails OD,product P "
						+ "Where OD.productId = P.productId"
						+ " AND OD.shoperId =  1001 "
						+ "AND OD.shippingStatus ='YES'"
					    + "GROUP BY orderId ORDER BY orderDate;";
		
		rst = stmt.executeQuery(query);
		while(rst.next())
		{
			int productId = rst.getInt(1);
			String date = rst.getString(2);
			int total = rst.getInt(3);
			productDetailsDisplay disp = new productDetailsDisplay(productId,date,total);
			System.out.println(disp.getId()+"   "+disp.getDate()+"   "+disp.getTotal());
		}
		
	}
	
	public void question2(String images[],int productId[]) throws SQLException
	{
		String Query = "INSERT INTO images VALUES(?,?)";
		PreparedStatement ps = con.prepareStatement(Query);
		for(int i = 0 ; i < productId.length; i++)
		{
			ps.setInt(1, productId[i]);
			ps.setString(2, images[i]);
			ps.addBatch();
		}
		int result[] = ps.executeBatch();
		System.out.println("TOTAL ROWS Inserted "+result.length);
		
		
	}
	public void question3() throws SQLException
	{
		String query = "DELETE FROM PRODUCTS WHERE productId NOT IN("
				+ "SELECT OD.productId FROM orderDetails OD, product P"
				+ "WHERE OD.productId = P.productId AND DATEDIFF(CURDATE(),OD.orderDate) > 365)";
		int result = stmt.executeUpdate(query);
		System.out.println("TOTAL ROWS DELETED "+result);
	}
	
}