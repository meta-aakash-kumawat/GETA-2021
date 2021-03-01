package intSet;

public class polynomial 
{
	private int expression[];
	
	/**
	 * Constructor to assign values to variable expression 
	 * @param arr values given by user
	 */
	polynomial(int arr[])
	{
		this.expression = arr;
	}
	/**
	 * This will return the variable expression
	 * @return
	 */
	public int[] getPoly()
	{
		return this.expression;
	}
	
	
	/**
	 * to evaluate the the polynomial with given values
	 * @param value to be evaluated
	 * @return float result contains the evaluated result
	 */
	public float evaluate(float value)
	{
		float result = 0;
		int polyExpression[] = this.expression;
		for(int i = 0; i < polyExpression.length; i++)
		{
			result = (float) (result + (polyExpression[i] * Math.pow(value, i)));
		}
		return result;
	}
	
	/**
	 * to return the degree of the given polynomial
	 * @return
	 */
	public int degree()
	{
		return this.expression.length-1;
	}
	
	
	/**
	 * to find the sum of given two polynomial expression
	 * @param firstExpression first polynomial
	 * @param secondExpression second polynomial
	 * @return int [] sumOfExpression returns the sum of two polynomials
	 */
	public int[] sumOfPolynomial(int firstExpression[] , int secondExpression[])
	{
		int sumOfExpressions[];
		int size = Math.max(firstExpression.length, secondExpression.length);
		sumOfExpressions = new int[size];
		for(int i = 0 ; i < firstExpression.length; i++)
		{
			sumOfExpressions[i] = sumOfExpressions[i] + firstExpression[i];
		}
		for(int i = 0 ; i < secondExpression.length; i++)
		{
			sumOfExpressions[i] = sumOfExpressions[i] + secondExpression[i];
		}
		return sumOfExpressions;
	}
	
	/**
	 * to find the product of given two polynomial expression
	 * @param firstExpression first polynomial
	 * @param secondExpression second polynomial
	 * @return int [] productExpression returns the product of two polynomials
	 */
	public int[] productOfPolynomial(int firstExpression[] , int secondExpression[])
	{
		int size = (firstExpression.length - 1) + (secondExpression.length -1) +1;
		int productExpression[] = new int[size];
		for( int i = 0; i< firstExpression.length; i++)
		{
			for( int j = 0; j < secondExpression.length; j++)
			{
				productExpression[i + j] = productExpression[i + j] +
						(firstExpression[i] * secondExpression[j]);
			}
		}
		return productExpression;
	}
	
	
}
