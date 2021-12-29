package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFreqElements {
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        int k = 2 ;
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) {
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }
        System.out.println(hashMap);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(Map.Entry<Integer , Integer> numb : hashMap.entrySet()){
            if(numb.getValue()>=k){
                arrayList.add(numb.getKey());
            }
        }

    }
}
