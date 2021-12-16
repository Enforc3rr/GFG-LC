package String;

import java.util.HashSet;

public class ConsistentString {
    public static void main(String[] args) {
        int count= 0;
        String allowed = "ab";
        String [] words = {"ad","bd","aaab","baa","badab"};
        HashSet<Character> hashSet = new HashSet<>();
        char [] allowedChars = allowed.toCharArray();
        for(char c : allowedChars){
            hashSet.add(c);
        }
        for(String word : words){
            boolean found = true;
            for(char c: word.toCharArray()){
                if(!hashSet.contains(c)){
                    found = false;
                }
            }
            if(found){
                count++;
            }
        }
    }
}
