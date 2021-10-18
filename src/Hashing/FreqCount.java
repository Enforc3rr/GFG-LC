package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class FreqCount {
    public static void main(String[] args) {
        int [] array = {1,1,2,4,4,5,5,2,2,4,3,1};


        HashMap<Integer , Integer> map = new HashMap<>();
        Arrays.stream(array).forEach(key -> {
            map.put(key,map.getOrDefault(key,0)+1);
        });

       array = Arrays.stream(array).filter(e -> e%2==0).toArray();
        System.out.println(Arrays.toString(array));
        
        System.out.println(map);
    }
}
