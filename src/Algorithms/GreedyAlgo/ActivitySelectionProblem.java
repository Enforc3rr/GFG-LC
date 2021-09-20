package Algorithms.GreedyAlgo;

import java.util.*;

public class ActivitySelectionProblem {
    public static void main(String[] args) {
        int[][] select = {{1,6},{7,12},{2,8},{10,16}};
        System.out.println(activity(select));
        int[] start = {2, 1} ;
        int[] end = {2, 2};
        int n = 2;
        System.out.println(activitySelection(start,end,n));

        int n1 = 4;
        int[] start1 = {1, 3, 2, 5};
       int[] end1 = {2, 4, 3, 6};
        System.out.println(activitySelection(start1,end1,n1));
    }
    /*
    [ (1,4) , [2,3] , (5,8) , (6,10) ]
        Greedy Approach :
            * Sort The Array On the basis of their Finishing Time : [ [6,10] , [5,8] , [1,4] , [2,3] ]
            * Now Select First Pair and Now Iterate if 2nd pair falls under time of this activity or not ,
              if it does then do not add it else add it up to stack or an arrayList.
     */
    private static int activity(int[][] select){
        Arrays.sort(select,(a,b)-> Integer.compare(a[1],b[1]));
//        for(int i = 0 ; i < select.length ; i++){
//            for(int j = i+1 ; j < select.length ; j++){
//                if(select[i][1]>select[j][1]){
//                    int[] temp = select[i];
//                    select[i]= select[j];
//                    select[j] = temp;
//                }
//            }
//        }

        ArrayList<int[]> arrayList = new ArrayList<>();
        arrayList.add(select[0]);
        //[1,6],[2,8],[7,12],[10,16]
        for(int i = 1 ; i < select.length ; i++){
            if(!(select[i][0]<=arrayList.get(arrayList.size()-1)[0]&&select[i][1]>=arrayList.get(arrayList.size()-1)[0]
                || select[i][0]<=arrayList.get(arrayList.size()-1)[1]&&select[i][1]>=arrayList.get(arrayList.size()-1)[1])){

                arrayList.add(select[i]);
            }
        }

        return arrayList.size();
    }

    public static int activitySelection(int[] start, int[] end, int n)
    {
        int totalActivityPossible = 0;
        int len = start.length;
        int [][] data = new int[len][2];
        for(int i = 0 ; i < len ; i++){
            data[i][0] = start[i];
            data[i][1] = end[i];
        }
        //[ (1,4) , [2,3] , (5,8) , (6,10) ]
        Arrays.sort(data , (a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> arrayList = new ArrayList<>();
        arrayList.add(data[0]);

        for(int i = 0 ; i < n ;i++){
            System.out.println(Arrays.toString(data[i]));
        }
        /*
        int[] start1 = {1, 3, 2, 5};
        int[] end1 = {2, 4, 3, 6};
            [[1,2],[2,3],[3,4],[5,6]]
         */
        for(int i = 1 ; i < data.length ; i++){
            if(!(data[i][0]<=arrayList.get(arrayList.size()-1)[0]&&data[i][1]>=arrayList.get(arrayList.size()-1)[0]
                    || data[i][0]<=arrayList.get(arrayList.size()-1)[1]&&data[i][1]>=arrayList.get(arrayList.size()-1)[1])){

                arrayList.add(data[i]);
            }
        }

        return arrayList.size();
    }
}
