package Graph;

import java.util.ArrayList;

public class Graph2 {
    public static void main(String[] args) {
        int vertices = 8;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(i, new ArrayList<Integer>());
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);
        addEdge(graph, 5, 6);
        addEdge(graph, 5, 7);
        addEdge(graph, 6, 7);
    }
    private static void addEdge(ArrayList<ArrayList<Integer>> connection, int u, int v) {
        connection.get(u).add(v);
        connection.get(v).add(u);
    }
    private static void dfsTraversal(ArrayList<ArrayList<Integer>> graph , int vertices , int source){
        boolean[] visited = new boolean[vertices+1];
        dfs(graph,source,visited);
    }
    private static void dfs(ArrayList<ArrayList<Integer>> graph ,int edge , boolean[] visited){
        visited[edge] = true;
        System.out.println(edge);
        for(int adjEdge : graph.get(edge)){
            if(!visited[adjEdge]){
                dfs(graph,adjEdge,visited);
            }
        }
    }

}
