package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
    Topological Sort : Kahn's BFS based Algorithm
    * Store in-degree of every Vertex
    * Create a queue
    * Add all 0 in-degree vertices to the q
    * while(!q.isEmpty()){
        curr = q.poll();
        print curr
        for every adjacent of curr
            * reduce in-degree of adj by 1
            * if adj == 0 , add it to q
      }
 */
public class TopologicalSortBFS {
    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 2);
        addEdge(adj,0, 3);
        addEdge(adj,1, 3);
        addEdge(adj,1, 4);
        addEdge(adj,2, 3);

        topologicalSort(adj,V);
    }
    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
    }
    private static void topologicalSort(ArrayList<ArrayList<Integer>> graph, int v) {
        int[] indegree  = indegreeIndexing(graph,v);
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < v ; i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            int current = queue.poll();


            System.out.print(current + " ");
            for(int associatedWithCurrent : graph.get(current)){
                if(indegree[current]==0){
                    indegree[associatedWithCurrent]--;
                    if(indegree[associatedWithCurrent]==0){
                        queue.add(associatedWithCurrent);
                    }
                }
            }
        }
    }
    private static int[] indegreeIndexing(ArrayList<ArrayList<Integer>> graph,int v){
        int[] indegreeNumber = new int[v];
        for(int i = 0 ; i < v ; i++ ){
            for(int edge : graph.get(i)){
                indegreeNumber[edge]+=1;
            }
        }
        return indegreeNumber;
    }
}
