package Array;

import java.util.ArrayList;
/*
Logic which we are applying here is pretty simple .
    - First we break up the string into multiple
 */

public class GetSubSeq {
    public static void main(String[] args) {
        System.out.println(getSubSeq("abc"));
    }
    private static ArrayList<String> getSubSeq(String str){
        if(str.length()==0){
            ArrayList<String> baseCaseList = new ArrayList<>();
            baseCaseList.add("");
            return baseCaseList;
        }

        char initialChar = str.charAt(0);
        String newStr = str.substring(1);
        ArrayList<String> list = getSubSeq(newStr);

        ArrayList<String> finalList = new ArrayList<>();

        for(String element : list){
            finalList.add(""+element);
            finalList.add(initialChar+element);
        }
        return finalList;
    }
}
