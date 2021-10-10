package Graph;

import java.util.ArrayList;

public class DetectingCycleInUndirectedGraph {
    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(i, new ArrayList<Integer>());
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 3);
        detectCycle(graph,vertices);
    }
    private static void addEdge(ArrayList<ArrayList<Integer>> connection, int u, int v) {
        connection.get(u).add(v);
        connection.get(v).add(u);
    }

    private static void detectCycle(ArrayList<ArrayList<Integer>> graph , int vertices ) {
        boolean[] visited = new boolean[vertices + 1];
        boolean check = false;
        for(int i = 0 ; i < vertices ; i++){
            if(!visited[i])
                check = dfs(graph,i,visited,-1);
        }
        if(check)
            System.out.println("Cycle");
        else
            System.out.println("No Cycle");
    }

    private static boolean dfs(ArrayList<ArrayList<Integer>> graph, int current, boolean[] visited,int parent) {
        visited[current]=true;
        for(int associatedWithCurrent : graph.get(current)){
            if(!visited[associatedWithCurrent]){
                if(dfs(graph,associatedWithCurrent,visited,current)) return true;
            }else if(parent!=associatedWithCurrent){
                return true;
            }
        }
        return false;
    }
}

