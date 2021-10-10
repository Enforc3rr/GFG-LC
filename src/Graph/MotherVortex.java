package Graph;

import java.util.ArrayList;

public class MotherVortex {
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        for(int i = 0 ; i < V ; i++){
            boolean[] visited = new boolean[V];
            boolean flag = false;
            dfsRec(adj,i,visited);
            for(int j = 0 ; j < V ; j++){
                if(!visited[j]){
                    flag = true;
                }
            }
            if(!flag){
                return i;
            }
        }
        return -1;
    }
    public void dfsRec(ArrayList<ArrayList<Integer>> graph , int source , boolean[] visited){
        visited[source]=true;
        for(int associatedWithSource : graph.get(source)){
            if(!visited[associatedWithSource]){
                dfsRec(graph,associatedWithSource,visited);
            }
        }
    }
}
