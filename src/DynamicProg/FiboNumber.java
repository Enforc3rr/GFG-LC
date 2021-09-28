package DynamicProg;

import java.util.Arrays;

// 0 1 1 2 3 5 8 13
public class FiboNumber {
    public static void main(String[] args) {
        int n = 8;
        int[] memo = new int[n+1];
        for(int i = 0 ; i < n ; i++){
            memo[i]=-1;
        }
        System.out.println(fiboDp(5,memo));
        System.out.println(Arrays.toString(memo));
    }


    private static int fiboDp(int n,int[] memo){
        if(memo[n]==-1){
            int res=0;
            if(n==0||n==1)
                res=n;
            else
                res=fiboDp(n-1,memo)+fiboDp(n-2,memo);
            memo[n]=res;
        }
        return memo[n];
    }
}
