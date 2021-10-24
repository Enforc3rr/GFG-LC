package Array;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,2};
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i : array){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int sum = 0;
        for(Map.Entry<Integer,Integer> mapValue : map.entrySet()) {
            if(mapValue.getValue()==1){
                sum = sum + mapValue.getKey();
            }
        }
    }
}
