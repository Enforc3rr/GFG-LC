package Recursion;

public class PaliCheck {
    public static void main(String[] args) {
        String check = "abba";
        System.out.println(pali(0,check.length()-1 , check));
    }
    public static boolean pali(int initIndex , int lastIndex , String check){
        if(initIndex >= lastIndex){
            return true;
        }else{
            return (check.charAt(initIndex)==check.charAt(lastIndex) && pali(initIndex+1 , lastIndex-1 , check));
        }
    }
}
