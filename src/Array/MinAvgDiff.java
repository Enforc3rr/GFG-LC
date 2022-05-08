package Array;

import java.util.ArrayList;

public class MinAvgDiff {
    public static void main(String[] args) {
        minimumAverageDifference(new int[]{2,5,3,9,5,3});
    }
    public static int minimumAverageDifference(int[] nums) {
        ArrayList<Integer> listForAvg = new ArrayList<>();
        int avg = 0 ;

        for(int i = 1 ; i < nums.length ;i++)
            avg = avg + nums[i];

        int numToBeSub=0;
        for(int i = 0 ; i < nums.length ; i++){
            
            numToBeSub = ((numToBeSub*i) + nums[i]);
            listForAvg.add(Math.abs((avg/(nums.length-i)) - (numToBeSub / (i+1))));

            if(i!=0)
                avg = avg - nums[i];
        }
        System.out.println(listForAvg);
        return avg;
    }
}
