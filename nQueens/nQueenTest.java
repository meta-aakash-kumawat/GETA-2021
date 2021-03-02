package recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class nQueenTest 
{
	int dimension = 0;
	int board[][];
	nQueens queen = new nQueens();
	
	@Test
	public void testWhenSolutionExists()
	{
		dimension = 4;
		board =new int[dimension][dimension];
		assertTrue(queen.nQueen(board, 0, dimension));
	}
	
	@Test
	public void testWhenNoSolutionExists()
	{
		dimension = 3;
		board =new int[dimension][dimension];
		assertFalse(queen.nQueen(board, 0, dimension));
	}
	
}
