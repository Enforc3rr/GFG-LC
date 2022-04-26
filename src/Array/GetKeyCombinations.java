package Array;

import java.util.ArrayList;

public class GetKeyCombinations {
    public static void main(String[] args) {

        //Input is being given in form of number
        System.out.println(gkc("78"));

    }
    static String [] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> gkc(String str){

        if(str.length()==0){
            ArrayList<String> baseCaseList = new ArrayList<>();
            baseCaseList.add("");
            return baseCaseList;
        }

        char firstNumber = str.charAt(0);
        ArrayList<String> list = gkc(str.substring(1));


        ArrayList<String> result = new ArrayList<>();
        String codeWord = codes[firstNumber - '0'];
        for(int i = 0 ; i < codeWord.length() ; i++){
            char letter = codeWord.charAt(i);
            for(String element : list)
                result.add(letter+element);
        }
        return result;
    }
}
