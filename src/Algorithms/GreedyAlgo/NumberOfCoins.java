package Algorithms.GreedyAlgo;

import java.util.Arrays;
/*
    In Greedy Algorithm as it's name suggests we take in the Largest Number first .
    Example : Greedy algorithms determine the minimum number of coins to give while making change.
    * Basic Syntax :
        int res = 0;
        loop(){
            i = selectedItem;
            if( feasible(i) ) {
                res = res + i ;
            }
        }
 */

public class NumberOfCoins {
    public static void main(String[] args) {
        int [] coins = {10,1,2,5};
        Arrays.sort(coins);
        /*
        1,2,5,10
         */
        int targetAmount = 52;
        int count=0;
        for(int i = coins.length-1 ; i >= 0 ; i--){
            if(targetAmount==0){
                break;
            }
            if(coins[i]<targetAmount){
                int countOfCoin = (int) Math.floor(targetAmount/coins[i]);
                targetAmount = targetAmount - (countOfCoin*coins[i]);
                count = count + countOfCoin;
            }
        }
        System.out.println(count);
    }
}
