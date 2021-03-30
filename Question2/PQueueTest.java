import static org.junit.Assert.*;

import org.junit.Test;


public class PQueueTest 
{
	
	
	@Test
	public void insert_whenSolutionExists_returnTrue()
	{
		PQueueImplementation queue = new PQueueImplementation(3);
		assertTrue(queue.insert(4));
	}
	
	@Test(expected = AssertionError.class)
	public void insert_whenQueueFull_Exception()
	{
		PQueueImplementation queue = new PQueueImplementation(1);
		assertTrue(queue.insert(4));
		assertTrue(queue.insert(88));
	}
	
	@Test(expected = AssertionError.class)
	public void insert_whenQueueNegativeSize_Exception()
	{
		PQueueImplementation queue = new PQueueImplementation(-1);
	}
	
	@Test
	public void remove_whenSolutionExists_returnTrue()
	{
		PQueueImplementation queue = new PQueueImplementation(3);
		queue.insert(4);
		queue.insert(7);
		queue.insert(9);
		assertTrue(queue.remove(7));
	}
	
	@Test
	public void peek_whenSolutionExists_returnValue()
	{
		PQueueImplementation queue = new PQueueImplementation(3);
		queue.insert(4);
		queue.insert(7);
		queue.insert(2);
		assertEquals(7,queue.peek());
	}
	
	
}
