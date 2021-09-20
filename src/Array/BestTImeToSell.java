package Array;

import java.util.Arrays;

public class BestTImeToSell {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    /*
    2,4,1
    4 - 1

     */
    private static int bestTime(int[] prices){
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int p : prices) {
            min = Math.min(min, p);
            result = Math.max(result, p - min);
        }
        return result;
    }
}
