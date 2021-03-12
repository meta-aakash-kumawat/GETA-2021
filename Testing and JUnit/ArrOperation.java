import static org.junit.Assert.*;

import org.junit.Test;

public class ArrOperation 
{	
	/**
	 * To get the size of the largest mirror section found in the input array.
	 * @param array input array
	 * @return Will return size of largest mirror section
	 */
	 public int getMaxMirror (int[] array)
	 {
		   int maximumMirror = 0;
	       if (array.length == 0)
	       {
	            throw new AssertionError("Array is empty.");
	       }
	       for (int i=0; i < array.length; i++)
	       {
	            int counter = 0;
	            for (int j = array.length-1; j >= 0 && i+counter < array.length;j--)
	            {
	                if (array[i+counter] == array[j]) 
	                    counter++;
	                else 
	                {
	                    maximumMirror = Math.max(maximumMirror, counter);
	                    counter = 0;
	                }
	            }
	            maximumMirror = Math.max(maximumMirror, counter);
	       }
	        	       
	       return maximumMirror;
	 }
	 
	 /**
	  * To get the number of clumps in the input array.
	  * @param array input array
	  * @return will return number of clumps
	  */
	 public int getClumps(int array[])
	 {	
		if (array.length == 0)
	       {
	            throw new AssertionError("Array is empty.");
	       }
		int count = 0 ;
		int totalClumps = 0;
		for(int i = 0; i < array.length - 1 ;i++)
		{
			if(array[i] == array[i+1] && count < 1)
			{	
				totalClumps++;
				count++;
			}
			else if (array[i] != array[i+1])
				count = 0;
			
		}
		return totalClumps;
	}
	
	 /**
	  * Return an array that contains exactly the same numbers as the input array, but 
	  * rearranged so that every X is immediately followed by a Y
	  * @param array input array
	  * @param X value Of X
	  * @param Y value of Y
	  * @return will return arranged array 
	  */
	public int[] fixXY(int array[] ,int X , int Y) 
	{	
		if (array.length == 0)
	       {
	            throw new AssertionError("Array is empty.");
	       }
		int countX = 0;
		int countY = 0;
		boolean checkLastX = false;
		for(int i = 0; i< array.length; i++)
		{
			if(array[i] == X)
				countX++;
			else if(array[i] == Y)
				countY++;
		}
		boolean checkPairX = false;
		for(int i = 0; i < array.length-1; i++)
		{
			if(array[i] == X && array[i+1]== X)
				checkPairX = true;
		}
		if(array[array.length-1] == X)
			checkLastX =true;
		if( countX != countY)
			throw new AssertionError("Number of X and Y are not equal.");
		else if(checkPairX)
			throw new AssertionError("Array has adjacent X");
		else if(checkLastX)
			throw new AssertionError("X occurs at the last index of the array");
		int j = 0;
		for(int i = 0; i < array.length-1; i++)
		{
			if(array[i] == X)
			{
				for(; j < array.length ; j++)
				{
					if(array[j] == Y)
					{
						int temp ;
						temp = array[i+1];
						array[i+1] = Y;
						array[j] = temp;
						i++;
						j = i+1;
						break;
					}
				}
			}
		}
		
		return array;
	}
	/**
	 * Return the index if there is a place to split the input array so that the sum of the numbers on one side
	 *  is equal to the sum of the numbers on the other side else return -1
	 * @param array input array
	 * @return will return the spliting index else -1
	 */
	public int getSplitArrayIndex(int array[])
	{
		if (array.length == 0)
	       {
	            throw new AssertionError("Array is empty.");
	       }
		int totalSum = 0;
		for(int i = 0; i < array.length; i++)
		{
			totalSum += array[i];
		}
		int index = -1;
		int leftSum = 0;
		int rightSum = totalSum;
		for(int i = 0; i < array.length; i++)
		{
			
			rightSum -= array[i];
			leftSum += array[i];
			if(leftSum == rightSum)
				return i+1;
		}
		return index;
	}
	
	
}
