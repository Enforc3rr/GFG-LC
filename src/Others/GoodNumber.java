package Others;

import java.util.ArrayList;
import java.util.HashMap;

public class GoodNumber {
    public static void main(String[] args) {
        int [] arr = {3,84,20};
        for(int n : arr){
            System.out.println(checkGoodNumber(n));
        }
    }
    public static boolean checkGoodNumber(int n){
        int count = 0;
        boolean [] list = new boolean[10];
        while(n >= 0){
            if((int) Math.pow(3,count) >= n){
                if(!list[count]){
                    n = n - (int) Math.pow(3,count);
                    list[count] = true;
                }else{
                    return false;
                }
            }
            count++;
        }
        return true;
    }
}
