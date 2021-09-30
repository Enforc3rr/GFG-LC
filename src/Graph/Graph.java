package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    public static void main(String[] args) {
        int vertices = 6 ;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(i , new ArrayList<Integer>());
        }
        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,2);
        addEdge(graph,3,4);
        addEdge(graph,3,5);
        addEdge(graph,4,5);
//        printEdges(graph);
        System.out.println("Executing BFS with Source");
        //bfs(graph,vertices,0);
        System.out.println();
//        System.out.println("Executing BFS without Source");
//        bfsWithoutSource(graph,vertices);

    }
    private static void addEdge(ArrayList<ArrayList<Integer>> connection , int u , int v){
        connection.get(u).add(v);
        connection.get(v).add(u);
    }
    private static void bfs(ArrayList<ArrayList<Integer>> graph , int vertices , int source){
        boolean [] visited = new boolean[vertices+1];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[source]=true;
        queue.add(source);
        while(!queue.isEmpty()){
            int takenOut = queue.poll();
            System.out.print(takenOut + " ");
            for(int attachedToTakenOut : graph.get(takenOut)){ //basically attachedToTakenOut is iterating over the list
                // provided by graph.get(takenOut) ------ 3 [1, 2, 4] ------
                if(!visited[attachedToTakenOut]){
                    visited[attachedToTakenOut] = true;
                    queue.add(attachedToTakenOut);
                }
            }
        }
    }
    /*
    1) i will iterate over the first value and add it to queue
    2) then i will proceed like the i did in the case of the BFS with Source....

    */
    private static void bfsWithoutSource(ArrayList<ArrayList<Integer>> graph , int vertices){
        boolean [] visited = new boolean[vertices+1];
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < graph.size() ; i++){
            queue.add(i);
            if(!visited[i]) {
                visited[i]=true;
                while (!queue.isEmpty()) {
                    int takenOut = queue.poll();
                    System.out.print(takenOut + " ");
                    for (int attachedToTakenOut : graph.get(takenOut)) {
                        if (!visited[attachedToTakenOut]) {
                            visited[attachedToTakenOut] = true;
                            queue.add(attachedToTakenOut);
                        }
                    }
                }
            }
        }
    }
}
