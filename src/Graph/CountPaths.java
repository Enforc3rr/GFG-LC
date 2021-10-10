package Graph;

import java.util.ArrayList;

public class CountPaths {
    int counter=0;
    public int countPaths(int V , ArrayList<ArrayList<Integer>> adj, int source, int destination) {
        boolean[] visited = new boolean[V+1];
        dfsRec(adj,source,destination,visited);
        return counter;
    }
    public void dfsRec(ArrayList<ArrayList<Integer>> graph , int source ,int desti,boolean[] visited){
        visited[source]=true;
        if(source==desti){
            counter++;
        }
        for(int associatedWithSource : graph.get(source)){
            if(!visited[associatedWithSource]){
                dfsRec(graph,associatedWithSource,desti,visited);
            }
        }
        visited[source]=false;
        return;
    }
}
