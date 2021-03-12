import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ArrOperationTest 
{
	ArrOperation object = new ArrOperation();
	
	@Test
	public void getMaxMirror_whenSolutionExists_returnValue()
	{
		int arr[] = {1, 2, 1, 4};
		assertEquals(3,object.getMaxMirror(arr));
	}
	
	@Test(expected = AssertionError.class)
	public void getMaxMirror_EmptyArray_Test()
	{
		int arr[] = {};
		object.getMaxMirror(arr);
	}
	
	@Test
	public void getClumps_whenSolutionExists_returnValue()
	{	
		int arr[] = {2,2,1,1,1,1,3};
		assertEquals(2,object.getClumps(arr));
	}
	
	@Test(expected = AssertionError.class)
	public void getClumps_EmptyArray_Test()
	{
		int arr[] = {};
		object.getClumps(arr);
	}
	
	@Test
	public void fixXY_whenSolutionExists_returnValues() throws Exception
	{	
		int arr[] = {1, 4, 1, 5, 5, 4, 1};
		int array[]= {1, 4, 5, 1, 1, 4, 5};
		assertEquals(array,object.fixXY(arr,4,5));
	}
	
	@Test(expected = AssertionError.class)
	public void fixXY_EmptyArray_Test()
	{
		int arr[] = {};
		object.fixXY(arr, 4, 5);
	}
	
	@Test(expected = AssertionError.class)
	public void fixXY_CountXandY_Test()
	{
		int arr[] = {1, 4, 1, 5, 0, 4, 1};
		object.fixXY(arr, 4, 5);
	}
	
	@Test(expected = AssertionError.class)
	public void fixXY_TwoAdjecentsOfX_Test()
	{
		int arr[] = {1, 4, 4, 5, 5, 4, 1};
		object.fixXY(arr, 4, 5);
	}
	
	@Test(expected = AssertionError.class)
	public void fixXY_LastX_Test()
	{
		int arr[] = {1, 4, 1, 5, 5, 8, 4};
		object.fixXY(arr, 4, 5);
	}
	
	@Test
	public void SplitArray_whenSolutionExists_returnValue()
	{
		int array[]={20,5,5,5,5};
		assertEquals(1,object.getSplitArrayIndex(array));
	}
	
	@Test(expected = AssertionError.class)
	public void Split_Array_EmptyArray_Test()
	{
		int arr[] = {};
		object.getSplitArrayIndex(arr);
	}
}
