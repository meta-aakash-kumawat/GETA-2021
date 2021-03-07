package recursion;

public class searching 
{	
	/**
	 * To find the position of the given element in the array using linear search
	 * @param array Array of elements
	 * @param start starting index
	 * @param length length of the array
	 * @param element Element to be searched
	 * @return
	 */
	public int LinearSearch(int array[], int start, int length ,int element )
	{
		if(length < start)
			return -1;
		if(array[start] == element)
			return 1;
		if(array[length] == element)
			return length;
		return LinearSearch(array, start + 1, length - 1 , element);
	}
	
	
	/**
	 * To find the position of the given element in the array using binary search
	 * @param array Array of elements
	 * @param start starting index
	 * @param length length of the array
	 * @param element Element to be searched
	 * @return
	 */
	public int BinarySearch(int array[], int start, int length, int element)
	{
		if(length >= start && start < array.length-1)
		{
			int mid = start + (length - 1) / 2;
			if(array[mid] == element)
				return mid;
			if(array[mid] > element)
				return BinarySearch(array, 1,mid -1 ,element);
			return BinarySearch(array, mid + 1, length,element);
		}
		return -1;
	}
}

