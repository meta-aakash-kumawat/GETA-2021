import java.util.Date;

public class RegularPolygon implements Shapes
{
	private Point origin;
	private double length;
	private int noOfSide;
	private double originDistance;
	private Date timeStamp;

	/**
	 * @return area of polygon
	 */
	public double getArea()
	{
		
		double apothem = length / (2 * Math.tan(Math.toRadians(180 / noOfSide)));
		return 0.5 * apothem * getPerimeter();
	}

	public double getPerimeter()
	{
		return length * noOfSide;
	}

	public Point getOrigin()
	{
		return origin;
	}

	public boolean isPointEnclosed(Point point)
	{
		return false;
	}

	public ShapeType getShapeType()
	{
		return ShapeType.REGULAR_POLYGON;
	}

	public double getOriginDistance()
	{
		return originDistance;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length) 
	{
		this.length = length;
	}

	public int getNoOfSide()
	{
		return noOfSide;
	}

	public void setNoOfSide(int noOfSide) 
	{
		this.noOfSide = noOfSide;
	}

	public Date getTimeStamp() 
	{
		
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) 
	{
		this.timeStamp = timeStamp;
	}

	public void setOrigin(Point origin) 
	{
		this.origin = origin;
	}

	public void setOriginDistance(double originDistance) 
	{
		this.originDistance = originDistance;
	}

	
}
