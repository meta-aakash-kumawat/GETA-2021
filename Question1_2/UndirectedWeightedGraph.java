package Question1_2;

import java.util.List;

public interface UndirectedWeightedGraph
{
	public boolean isConnected();

    public List<Integer> reachable(int node);

    public int[][] minimumSpanningTree();

    public int shortestPath(int node1, int node2);

}
