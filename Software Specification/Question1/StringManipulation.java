
public class StringManipulation 
{	
	
	/**
	 * Compare two Strings and return 1 if they are equal and 0 if not
	 * @param stringFirst First String for comparison
	 * @param stringSecond Second String for comparison
	 * @return integer result of comparison
	 */
	public int compare(String stringFirst, String stringSecond)
	{
		int result = 0;
		int firstStringLength = stringFirst.length();
		int secondStringLength = stringSecond.length();
		char firstString[] = stringFirst.toCharArray();
		char secondString[] = stringSecond.toCharArray();
		if(firstStringLength != secondStringLength)
			return result;
		else
		{	int temp = 0;
			for(int i = 0; i < firstStringLength ; i++)
			{	
				if( firstString[i] == secondString[i])
				{
					temp++;
				}
			}
			if( temp  == firstStringLength)
				result = 1;
			else
				result = 0;
			return result;
		}
	}
	
	/**
	 * Reverse the given string
	 * @param string String to be reversed
	 * @return String reverseString return reverse of the string
	 */
	public String reverse(String string)
	{
		int lengthOFString = string.length();
		String reverseString = "";
		for( int  j = lengthOFString -1 ; j >= 0; j-- )
		{
			reverseString = reverseString + string.substring(j,j+1);
		}
		
		return reverseString;
	}
	
	/**
	 * Convert Lowercase characters to uppercase and vice-vesa
	 * @param string 
	 * @return string after conversion done
	 */
	public String toUppertoLower(String string)
	{
		int lengthOFString = string.length();
		for( int i = 0; i < lengthOFString; i++)
		{
			if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
			{	
				char t = (char) (string.charAt(i) + 32);
				string = string.substring(0,i) + (t) + string.substring(i+1);
			}
			else
			{				
				char t = (char) (string.charAt(i) - 32);
				string = string.substring(0,i) + (t) + string.substring(i+1);
			}
		}	
		return string;
	}
	
	/**
	 * To return the largest word present in the string
	 * @param string 
	 * @return string largestWOrd contains largest word in the string
	 */
	public String largestWord(String string)
	{
		int lengthOFString = string.length();
		int startIndex = 0;
		int endIndex = 0;
		int maxLength = Integer.MIN_VALUE;
		String largestWOrd = "";
		for(int i = 0; i < lengthOFString; i++)
		{
			if(string.charAt(i) == ' ' || i == lengthOFString-1)
			{	endIndex = i;
				if(i == lengthOFString - 1)
					endIndex = i+1;
				int t = string.substring(startIndex , endIndex).length();
				if(maxLength <= t)
				{
					maxLength = t;
					largestWOrd = string.substring(startIndex ,endIndex );
				}
				startIndex = i+1;
			}
		}
		return largestWOrd;
	}
	
	
}
