package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
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
        addEdge(graph,5,6);
        addEdge(graph,5,7);
        addEdge(graph,6,7);
//        printEdges(graph);
        System.out.println("Executing BFS with Source");
        bfsWithSource(graph, vertices, 0);
        System.out.println();
        System.out.println("Executing BFS without Source");
        bfsWithoutSource(graph, vertices);
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> connection, int u, int v) {
        connection.get(u).add(v);
        connection.get(v).add(u);
    }
    public static void bfsWithSource(ArrayList<ArrayList<Integer>> graph , int vertices , int source){
        boolean[] visited = new boolean[vertices+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source]=true;
        while (!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current + " ");
            for(int associatedWithCurrent : graph.get(current)){
                if(!visited[associatedWithCurrent]){
                    queue.add(associatedWithCurrent);
                    visited[associatedWithCurrent]=true;
                }
            }
        }
    }
    public static void bfsWithoutSource(ArrayList<ArrayList<Integer>> graph , int vertices){
        boolean [] visited = new boolean[vertices+1];
        for(int i = 0 ; i < vertices ; i++){
            if(!visited[i]){
                bfs(graph,i,visited);
            }
        }
    }
    public static void bfs(ArrayList<ArrayList<Integer>> graph , int source , boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        visited[source]=true;
        queue.add(source);
        while (!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current + " ");
            for(int associatedWithCurrent : graph.get(current)){
                if(!visited[associatedWithCurrent]){
                    visited[associatedWithCurrent]=true;
                    queue.add(associatedWithCurrent);
                }
            }
        }
    }
}

