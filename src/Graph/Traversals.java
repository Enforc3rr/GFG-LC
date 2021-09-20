package Graph;

import java.util.ArrayList;

public class Traversals {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for(int i = 0 ; i<= 6 ; i++ ){
            arrayList.add(new ArrayList<>());
        }
        addEdge(arrayList,1,2);
        addEdge(arrayList,1,3);
        addEdge(arrayList,2,4);
        addEdge(arrayList,3,5);
        addEdge(arrayList,4,6);
        System.out.println(arrayList);
    }
    private static void addEdge(ArrayList<ArrayList<Integer>> arrayList,int adj,int add){
//        arrayList.get(adj).add(add);

        arrayList.get(adj).add(add);
        arrayList.get(add).add(adj);
        /*
        * For Un-Directed Graph

         */
    }
}
