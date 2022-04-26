package Array;

import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int start = 0 ;
        int end = array.length-1;
        recRev(array,start,end);
        System.out.println(Arrays.toString(array));
    }
    static void recRev(int[]array,int start , int end){
        if(start  < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            end-- ;
            start++;
            recRev(array,start,end);
        }
    }
}
