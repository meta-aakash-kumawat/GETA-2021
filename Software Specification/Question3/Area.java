
public class Area 
{	
	/**
	 * To find out the area of traingle 
	 * @param height height of the triangle
	 * @param base base of the traingle
	 * @return double area has the computed area 
	 */
	public double triangle (double height, double base)
	{	double area = 0;
		try
		{
			area = 0.5 * base * height;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		return area;
	}
	/**
	 * To find out the area of square 
	 * @param width widht of the square
	 * @return double area has the computed area 
	 */
	public double square (double width)
	{	double area = 0;
		try
		{
			area = width * width;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		return area;
	}
	
	/**
	 * To find out the area of rectangle 
	 * @param height height of the rectangle
	 * @param width width of the rectangle
	 * @return double area has the computed area 
	 */
	public double rectangle (double height, double width)
	{	double area = 0;
		try
		{
			area = width * height;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		return area;
	}
	
	/**
	 * To find out the area of circle 
	 * @param radius radius of the circle
	 * @return double area has the computed area 
	 */
	public double circle (double radius)
	{	double area = 0;
		
		try
		{
			area = Math.PI * radius * radius;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		return area;
	}



}
