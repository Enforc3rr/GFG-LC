package Algorithms.GreedyAlgo;

import java.util.Arrays;

public class FractionalKnapsack {
    public static void main(String[] args) {
//        int[][] knapSack = {{50,600},{20,500},{30,400}};
//        int target = 70;
//        System.out.println(knap(knapSack,target));
        int[][] knapSack2 = {{10,200},{5,50},{20,100}};
        int target2 = 15;
        System.out.println(knap(knapSack2,target2));
    }
    private static int knap(int[][] array , int target){
        int res = 0 ;

        Arrays.sort(array , (a,b)->Integer.compare(a[0],b[0]));

        for(int i = 0 ; i < array.length ; i++){
            if(array[i][0]<=target){
                res = res + array[i][1];
                target = target-array[i][0];
            }else if(array[i][0]>target&&target!=0){
                res = res + ((array[i][1]*target)/array[i][0]);
                target = target-array[i][0];
            }else{
                break;
            }
        }
        return res;
    }
}
