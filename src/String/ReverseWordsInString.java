package String;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "a good   example";
        String [] words = s.trim().split("//s");
//        System.out.println(Arrays.toString(words));
        String newSentence = "";
        for(int i = words.length-1 ; i >=1   ; i--){
            newSentence = newSentence + words[i] + " ";
        }
        newSentence = newSentence + words[0];
        System.out.println(newSentence);

        //second approach using Stack



        s = s + " ";

        Stack<String> stack = new Stack<>();
        String newWord = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != ' '){
                newWord = newWord+s.charAt(i);
//                System.out.println(newWord);
            }else{
                if(!newWord.equals("")){
                    stack.push(newWord);
                    newWord = "";
                }
            }
        }
        System.out.println(stack);
        String newSentence2 = "";
        while (stack.size()!=1){
            newSentence2 = newSentence2 + stack.pop() + " ";
        }
        System.out.println(newSentence2 + stack.pop());
    }
}
