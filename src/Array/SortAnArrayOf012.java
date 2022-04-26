package Array;

import java.util.Arrays;
import java.util.HashMap;

public class SortAnArrayOf012 {
    public static void main(String[] args) {
        int [] arr = new int[]{2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {

        int numsLength = nums.length;

        int[] result = new int[numsLength];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int element : nums){
            hashMap.put(element,hashMap.getOrDefault(element,0)+1);
        }
        int numberOfZeros = hashMap.getOrDefault(0,0);
        int numberOfOnes = hashMap.getOrDefault(1,0);
        int numberOfTwos = hashMap.getOrDefault(2,0);


        int finalIndex = 0;
        while (numberOfZeros > 0){
            result[finalIndex]=0;
            finalIndex++;
            numberOfZeros--;
        }
        while (numberOfOnes > 0){
            result[finalIndex]=1;
            finalIndex++;
            numberOfOnes--;
        }
        while (numberOfTwos > 0 && finalIndex < numsLength){
            result[finalIndex]=2;
            finalIndex++;
            numberOfTwos--;
        }
        nums = result;
//        nums = Arrays.copyOf(result , numsLength);
        System.out.println(Arrays.toString(nums));
    }
}
