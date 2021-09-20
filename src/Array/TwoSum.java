package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        int [] array = {5,2,1,3};
        int target = 3 ;
        int [] num = new int[2];
        two(array,target,0,1,num);
        for(int n : num){
            System.out.println(n);
        }
        Arrays.sort(array);

        System.out.println(Arrays.stream(array).max().getAsInt());
        System.out.println(Arrays.binarySearch(array,312));
    }

    private static int [] two(int [] array , int target, int start , int end , int [] num){
        if(start < end && end < array.length){
            if(array[start]+array[end]==target) {
                num[0] = start ;
                num[1] = end ;
            }else {
                two(array,target,start+1,end,num);
                two(array,target,start,end+1,num);
            }
        }
        return num;
    }
}

