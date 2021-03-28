package Question1_2;

import java.util.List;

public class GraphMain 
{
	public static void main(String args[])
	{
		ImplementationUsingMatrix graphMatrix;
		graphMatrix = new ImplementationUsingMatrix(new int[][] { {0, 5, 0, 0, 8}, 
																  {5, 0, 9, 10, 1},
																  {0, 9, 0, 4, 0}, 
																  {0, 10, 4, 0, 2}, 
																  {8, 1, 0, 2, 0}});
		System.out.println("Connected or not "+graphMatrix.isConnected());
		
		List<Integer> list = graphMatrix.reachable(2);
		System.out.println("Reachable nodes" +list);
		
		int a[][] = graphMatrix.minimumSpanningTree();
		System.out.println("Minimum spanning Tree");
		for(int i = 0; i< 5 ;i++)
		{
			for(int j = 0; j <5 ;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("shortest path "+graphMatrix.shortestPath(1, 2));
	}
}
