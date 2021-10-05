package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "leetcode";
        char [] charArray = s.toCharArray();
        System.out.println(s.lastIndexOf('e'));
        System.out.println(s.indexOf('e'));
        LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
        for(char c : charArray){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
