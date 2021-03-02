package recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class searchingTest 
{
	@Test
	public void LinearSearchResult()
	{
		searching Linear = new searching();
		int array[] = {1,2,3,4};
		assertEquals(-1, Linear.LinearSearch(array,0,3,5));
		assertEquals(2,Linear.LinearSearch(array, 0, 3, 3));
	}
	
	@Test
	public void BinarySearchResult()
	{
		searching Binary = new searching();
		int array[] = {1,2,3,4};
		assertEquals(-1, Binary.LinearSearch(array,0,3,5));
		assertEquals(2,Binary.LinearSearch(array, 0, 3, 3));
		
	}
}
