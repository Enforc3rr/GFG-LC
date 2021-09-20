package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class LetterCombination {
    public static void main(String[] args) {
        HashMap<String,String> keyMap = new HashMap<>();
        keyMap.put("2","abc");
        keyMap.put("3","def");
        keyMap.put("4","ghi");
        keyMap.put("5","jkl");
        keyMap.put("6","mno");
        keyMap.put("7","pqrs");
        keyMap.put("8","tuv");
        keyMap.put("9","wxyz");

        String digits = "23";
        String [] letters = new String[digits.length()];

        for(int i = 0 ; i < digits.length() ; i++){
            letters[i]=keyMap.get(digits.split("")[i]);
        }
        List<String> list = new ArrayList<>();
        combinations(letters,list);
    }
    private static void combinations(String [] letters,List<String> words){
        
    }
}
