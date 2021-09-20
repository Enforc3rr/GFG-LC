package Algorithms.GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencingProb {
    public static void main(String[] args) {
        int[] startTime = {};
        int[] endTime = {};
        int[] profitTime = {};
    }
    /*
        1 - 40
        4 - 70
        1 - 80
        1 - 100


                                        *****NEED TO DO IT AGAIN*****
     */
    private static int jobSeq(int[][] jobs){
        Arrays.sort(jobs , (a,b)->Integer.compare(a[1],b[1]));
        int maxProfit = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        return maxProfit;
    }
}
