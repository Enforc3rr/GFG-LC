package Others;

import java.util.Arrays;
import java.util.HashMap;

public class MeanAfterRemoving {
    public static void main(String[] args) {
        int [] arr = {1,3,2,4};
        double mean = 2.5;
        HashMap<Integer , Integer> map = new HashMap<>();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            if((double) (arr[i]+arr[j])/2 == mean){
                map.put(arr[i],arr[j]);
                i++;
                j--;
            }else{
                j--;
            }
        }

        System.out.println(map);
    }
}
