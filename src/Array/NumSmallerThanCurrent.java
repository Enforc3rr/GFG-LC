package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class NumSmallerThanCurrent {
    public static void main(String[] args) {
        NumSmallerThanCurrent numSmallerThanCurrent = new NumSmallerThanCurrent();
        System.out.println(Arrays.toString(numSmallerThanCurrent.smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }
    /*
    Input: nums = [8,1,2,2,3]
    Sorted : 1 ,2 , 2, 3, 8
    Map :
        8 -
    Output: [4,0,1,1,3]
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = nums.clone();
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 || nums[i]!=nums[i+1]){
                hashMap.put(nums[i],count);
                count = i+1;
            }
        }
        for(int i=0;i<nums.length;i++)
            result[i] = hashMap.get(result[i]);

        return result;
    }
}

