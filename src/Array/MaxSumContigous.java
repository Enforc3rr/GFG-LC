package Array;

import java.util.ArrayDeque;

//Kadane Algorithm .

public class MaxSumContigous {
    public static void main(String[] args) {
        int [] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int max_far = Integer.MIN_VALUE;
        int max_end = 0 ;
        for(int element  : A){
            max_end = max_end + element;
            if(max_end > max_far){
                max_far = max_end;
            }
            if(max_end < 0){
                max_end = 0;
            }
        }
        System.out.println(max_far);
    }
}
