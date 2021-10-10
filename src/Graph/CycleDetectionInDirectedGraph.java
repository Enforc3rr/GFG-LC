package Graph;

import java.util.ArrayList;
/*
For Directed Graph we use a concept of recursion stack which is basically array of boolean data type similar to visited
 */
public class CycleDetectionInDirectedGraph {
    public static void main(String[] args)
    {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,2,1);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,4,5);
        addEdge(adj,5,3);

        if(dfs(adj, V))
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> graph, int vertices){

        boolean[]visited = new boolean[vertices+1];
        boolean[]recursionStack = new boolean[vertices+1];

        for(int i = 0 ; i < vertices ; i++){
            if(!visited[i])
                if(dfsRecursion(graph,visited,recursionStack,i))
                    return true;
        }
        return false;
    }

    public static boolean dfsRecursion(ArrayList<ArrayList<Integer>> graph , boolean[] visited , boolean[] recursionStack , int source){
        visited[source]=true;
        recursionStack[source]=true;
        for(int associatedWithSource : graph.get(source)){
            if(recursionStack[associatedWithSource]){
                return true;
            }else if(!visited[associatedWithSource]&&dfsRecursion(graph,visited,recursionStack,associatedWithSource)){
                return true;
            }
        }
        recursionStack[source]=false;
        return false;
    }
}
