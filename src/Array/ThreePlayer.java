package Array;


import java.util.Arrays;

/*
You are given a list of non-negative integers piles where each piles[i] represents the number of coins on pile i.
In each move, you can do the following until there's no more coins:

Pick any 3 piles from piles
A friend will take the pile with the maximum number of coins
You will take the next highest pile
A friend will take the last pile
Return the maximum number of coins you can acquire.
 */
public class ThreePlayer {
    public static void main(String[] args) {
        int [] piles = {2, 4, 1, 3, 5, 6};
        System.out.println(max(piles));
    }

    private static int max(int[] piles){
        Arrays.sort(piles);
        int loopRun = piles.length/3;
        int secondEnd = piles.length-2;
        int start = 0;
        int sum = 0;
        while(loopRun>0&&secondEnd>start){
            sum = sum + piles[secondEnd];
            start++;
            secondEnd = secondEnd-2;
        }
        return sum;
    }
}
