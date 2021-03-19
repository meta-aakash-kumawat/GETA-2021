
public class productDetailsDisplay
{
	int productId;
	String date;
	int total ;
	public productDetailsDisplay(int id,String date,int total)
	{
		this.productId = id;
		this.date = date;
		this.total = total;
	}
	public int getId()
	{
		return this.productId;
	}
	public String getDate()
	{
		return this.date;
	}
	public int getTotal()
	{
		return this.total;
	}
}
