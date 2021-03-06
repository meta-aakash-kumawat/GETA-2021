public abstract class ShapeFactory implements Shapes
{

	/**
	 * Method to create the reference to the object of shape type on the basis of requirement.
	 * @param shapeType : The type of the shape whose object has to be created.
	 * @return : The reference to the object of the shape type.
	 */
	public static Shapes createShape(ShapeType shapeType)
	{
		Shapes shape ;
		switch (shapeType) 
		{
		case CIRCLE:
			shape = new Circle();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case REGULAR_POLYGON:
			shape = new RegularPolygon();
			break;
		case SQUARE:
			shape = new Square();
			break;
		case TRIANGLE:
			shape = new Triangle();
			break;
		default:
			throw new AssertionError("Invalid Shape Type !!");

		}
		return shape;
	}
}