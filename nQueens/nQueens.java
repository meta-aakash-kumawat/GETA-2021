package recursion;

public class nQueens 
{
	int board[][];
	
	/**
	 * to check whether their queen can be placed on given row and column
	 * @param board chess board
	 * @param row current row
	 * @param column current column
	 * @param dimension dimension of the board
	 * @return true if place is valid else false
	 */
	private boolean isValidToPlaceQueen(int board[][] , int row, int column, int dimension)
	{
		
		for(int i = 0; i < column; i++)
		{
			if(board[row][i] == 1)
				return false;
		}
		for( int i = row , j = column ; i >= 0 && j >= 0; i-- ,j--)
		{
			if(board[i][j] == 1)
				return false;
		}
		for( int i = row, j = column; j >= 0 && i < dimension; i++, j--)
		{
			if( board[i][j] == 1)
				return false;
		}
		return true;
	}
	
	/**
	 * To check for nqueen problem can be solvable for the given dimension
	 * @param board chess borad for given dimension
	 * @param startRow starting row
	 * @param dimension dimension of the ches board 
	 * @return this will return true if nQueen problem is solvable else return false
	 */
	public boolean nQueen(int board[][] , int startRow, int dimension)
	{
		if(startRow >= dimension)
			return true;
		for(int i = 0 ;i < dimension; i++)
		{
			if(isValidToPlaceQueen(board, i, startRow, dimension))
			{
				board[i][startRow] = 1;
				if(nQueen( board, startRow + 1, dimension))
					return true;
				board[i][startRow] = 0;
			}
		}
		return false;
	}
	/**
	 * to print NQueen board
	 * @param board chess board
	 */
	public void printNQueens(int board[][])
	{
		for(int i = 0; i < board.length ; i++)
		{
			for(int j = 0;j < board.length; j++)
			{
				System.out.print(" "+board[i][j]);
			}
			System.out.println();
		}
	}
}

