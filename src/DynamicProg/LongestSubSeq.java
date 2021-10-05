package DynamicProg;

import java.util.Arrays;

public class LongestSubSeq {
    static int[][] memo; // dimension depends upon value that's changing during recursive calls
    static int lcs(String s1, String s2, int n, int m)
    {
        if(memo[n][m]!=-1)
            return memo[n][m];
        if(n==0 || m==0)
            memo[n][m]=0;
        else
        {
            if(s1.charAt(n-1)==s2.charAt(m-1))
                memo[n][m] = 1 + lcs(s1,s2,n-1,m-1);
            else
                memo[n][m] = Math.max(lcs(s1,s2,n-1,m),lcs(s1,s2,n,m-1));
        }
        return memo[n][m];
    }
    public static void main (String[] args) {
        String s1="AXYZ", s2="BAZ";
        int n = 4, m = 3;
        memo= new int[n+1][m+1];
        for(int[] i: memo)
        {
            Arrays.fill(i,-1);
        }
        System.out.println(lcs(s1,s2,n,m));
    }
}