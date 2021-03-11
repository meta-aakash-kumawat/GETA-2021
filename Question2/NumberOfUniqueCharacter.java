package Question2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NumberOfUniqueCharacter 
{
	HashMap<String, Integer> cache = new HashMap<>();
	
	/**
	 * to count unique characters in the given string
	 * @param input input string 
	 * @return will return the number of unique characters in the string
	 */
	public int countUniqueCharachters(String input)
	{
		int result = 0;
		if(cache.containsKey(input))
		{
			result = cache.get(input);
			return result;
		}
		
		HashMap<Character ,Integer> uniqueCharacters = new HashMap<>();
		for(int i = 0; i < input.length(); i++)
		{
			char tempChar = input.charAt(i);
			
			if(uniqueCharacters.containsKey(tempChar))
			{
				int count = uniqueCharacters.get(tempChar);
				uniqueCharacters.put(tempChar,count+1);
			}
			else
				uniqueCharacters.put(tempChar, 1);
		}
		Set<Character> keySet = uniqueCharacters.keySet();
		Iterator<Character> iterator = keySet.iterator();
		while(iterator.hasNext())
		{
			if(uniqueCharacters.get(iterator.next())== 1)
				result ++;
		}
		cache.put(input, result);
		return result;
	}
	
	public static void main(String args[])
	{
		NumberOfUniqueCharacter obj = new NumberOfUniqueCharacter();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input string");
		String inputString =in.nextLine();
		int value = obj.countUniqueCharachters(inputString);
		System.out.println(value);
		//System.out.println(obj.countUniqueCharachters("Aqwe!#@qwe#@"));
	}
}
