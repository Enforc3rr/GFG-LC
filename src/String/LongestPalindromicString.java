package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LongestPalindromicString {
    public static void main(String[] args) {
//        System.out.println(longestPalindrome("babad"));
        String s = "aba";
        boolean check = false;
        recursivePali("aba",0,s.length()-1,"",check);
        System.out.println(check);

    }
    private static void recursivePali(String s,int start , int end , String rev,boolean check){
        if(start <= end){
            rev = rev + s.charAt(end);
            recursivePali(s,start,end-1,rev,check);
            System.out.println(rev);
            if(s.equals(rev)){
                check = true;
            }
        }
    }
    private static String longestPalindrome(String s) {
        if(s.length() == 0 || s == null){
            return s;
        }
        ArrayList<String> list = new ArrayList<>();

        combinations(s,"",0,s.length(),list);

        System.out.println(Arrays.toString(list.toArray()));
        return null;
    }

    private static void combinations(String s, String current , int index , int end , ArrayList<String> list ){
        System.out.println("Reached Here");

            if(palindrome(current)&& !current.equals("")){
                System.out.println(current);
                list.add(current);
            }
            for(int i = index+1 ; i < end ; i++){
                combinations(s,current+s.charAt(i),index+1,end-1,list);
        }
    }



    private static boolean palindrome(String s){

        Stack<Character> stack = new Stack<>();
        int length = s.length();
        String rev = "";
        for(int i = 0 ; i < length ; i++){
            stack.push(s.charAt(i));
        }
        for(int i = 0 ; i < length ; i++){
            rev = rev + stack.pop()  ;
        }
        System.out.println("String " + s);
        System.out.println("rev " + rev);
        return s.equals(rev);
    }
}
