package recursion;

public class LCMandHCF 
{	
	/**
	 * To find the Least Common Factor of two numbers
	 * @param firstNumber First Number
	 * @param secondNumber Second Number
	 * @return will retrun the evaluated lcm 
	 */
	public int lcm(int firstNumber , int secondNumber)
	{	
		if(firstNumber <= 0 || secondNumber <=0)
			throw new AssertionError("Numbers can't be negative or zero");
		return( firstNumber / gcd(firstNumber, secondNumber)) * secondNumber;
	}
	
	/**
	 * To find the Greatest Common Factor of two numbers
	 * @param firstNumber First Number
	 * @param secondNumber Second Number
	 * @return will retrun the evaluated GCD 
	 */
	public int gcd(int firstNumber , int secondNumber)
	{
		if(firstNumber == 0)
		{
			return secondNumber;
		}
		return gcd( secondNumber % firstNumber, firstNumber);
	}
	
	
	/**
	 * To find the Highest Common Factor of two numbers
	 * @param firstNumber First Number
	 * @param secondNumber Second Number
	 * @return will retrun the evaluated HCF 
	 */
	public int hcf(int firstNumber, int secondNumber)
	{
		if(firstNumber <= 0 || secondNumber <=0)
			throw new AssertionError("Numbers can't be negative or zero");
		return gcd(firstNumber ,secondNumber);
	}
}
