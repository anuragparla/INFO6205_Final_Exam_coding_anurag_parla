import java.util.*;
class LargestTree{

    static void addEdge(LinkedList<Integer> adj[], int u, int v)
    {
        adj[u].add(v);
        adj[v].add(u);
    }

    static int DFS(int u, LinkedList<Integer> adj[], Vector<Boolean> visited)
    {
        visited.add(u, true);
        int size = 1;

        for (int i = 0; i < adj[u].size(); i++) {
            if (visited.get(adj[u].get(i)) == false) {
                size += DFS(adj[u].get(i),
                        adj, visited);
            }
        }
        return size;

    }

    public int largestTree(LinkedList<Integer> adj[], int V)
    {
        Vector<Boolean> visited = new Vector<>();
        for(int i = 0; i < V; i++)
        {
            visited.add(false);
        }
        int result = 0;

        for (int j = 0; j < V; j++)
        {
            if (visited.get(j) == false)
            {
                result = Math.max(result,
                        DFS(j, adj, visited));
            }
        }
        return result;

    }
}