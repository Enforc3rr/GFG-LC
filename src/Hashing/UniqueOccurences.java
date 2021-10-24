package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueOccurences {
    public static void main(String[] args) {

    }
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(set.contains(m.getValue())){
                return false;
            }else{
                set.add(m.getValue());
            }
        }
        return true;
    }
}
