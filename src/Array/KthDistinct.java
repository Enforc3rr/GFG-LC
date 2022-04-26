package Array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class KthDistinct {
    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"},2));
    }
    public static String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        String ans = "";
        int count = 0;
        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(e.getValue()==1){

                if(count==k-1){
                    ans = ans + e.getKey();
                    break;
                }
                count++;
            }
        }
        return ans;
    }
    public static int[] sortedSquares(int[] nums) {
        nums = Arrays.stream(nums).map(val -> val*val).toArray();
        Arrays.sort(nums);
        return nums;

    }
}
