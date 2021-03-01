package intSet;

import java.util.Arrays;

public class intSet 
{	
	
	private int set[];
	
	/**
	 * Constructor to assign values to variable set 
	 * @param setArray values given by user
	 */
	intSet(int setArray[])
	{
		this.set = setArray;
	}
	
	/**
	 * This will return the variable set
	 * @return
	 */
	public int[] getSet()
	{
		return set;
	}
	/**
	 * to check wheather given number is the member of the set or not
	 * @param number to be check in the set
	 * @return boolean result return true or false
	 */
	public boolean isMember(int number)
	{
		boolean result = false;
		int tempSet[] = this.getSet();
		for( int i = 0; i < tempSet.length; i++)
		{
			if( number == tempSet[i])
			{
				result = true;
			}
		}
		return result;
	}
	
	/**
	 * to find out the size of the given set
	 * @return int size
	 */
	public int sizeOfSet()
	{
		int size = this.set.length;
		return size;
	}
	
	/**
	 * to check wheather given set is subset of another set
	 * @param subSet to be check for subset
	 * @return boolean  true or false
	 */
	public boolean isSubSetofSet(int subSet[])
	{
		if( subSet.length == 0)
				return true;
		else
		{
			int tempSet[] = this.getSet();
			int count = 0;
			for(int i = 0; i < subSet.length; i++)
			{
				for(int j = 0; j < tempSet.length; j++)
				{
					if( subSet[i] == tempSet[j])
					{
						count++;
						tempSet[j] = -1;
					}
				}
			}
			if( count == subSet.length)
				return true;
			else
				return false;
		}
	}
	
	/**
	 * to find the compliment of the given set
	 * @param set
	 * @return int [] complimentSet return compliment set
	 */
	public int[] setCompliment(int set[])
	{
		int complimentSet[] = new int[1000-set.length];
		for(int i = 1 ,k = 0; i <= 1000 ; i++)
		{	int flag = 0;
			for(int j = 0; j < set.length; j++)
			{
				if(i == set[j] )
					flag = 1;
			}
			if( flag == 0)
				complimentSet[k++] = i;
		}
		return complimentSet;
	}
	
	/**
	 * to find out the union of the given two set
	 * @param firstSet first set elements
	 * @param secondSet second set elements
	 * @return int [] unionOfSets return union of the two given sets
	 */
	public int[] setUnion(int firstSet[] , int secondSet[])
	{
		int lengthOfFirstSet  = firstSet.length;
		int lengthOfSecondSet = secondSet.length;
		int lengthOfUnionSet = lengthOfFirstSet + lengthOfSecondSet; 
		int unionSet[] = new int[lengthOfUnionSet];
		int unionSetIndex = 0;
		for(int i = 0 ; i < lengthOfFirstSet ; i++)
		{
			unionSet[unionSetIndex++] = firstSet[i];
		}
		for(int i = 0; i < lengthOfSecondSet ; i++)
		{	int flag = 0;
			for(int j = 0; j < lengthOfFirstSet ; j++)
			{
				if(secondSet[i] == firstSet[j])
					flag = 1;
			}
			if( flag == 0)
				unionSet[unionSetIndex++] = secondSet[i];
		}
		Arrays.sort(unionSet);
		int unionOfSets[] =new int[unionSetIndex];
		for(int i = 0, j = 0; i < unionSet.length ;i++)
		{	
			if(unionSet[i] != 0)
				unionOfSets[j++] = unionSet[i];	
		}
		return unionOfSets;
	}
	
}
