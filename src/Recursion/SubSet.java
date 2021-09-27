package Recursion;

public class SubSet {
    public static void main(String[] args) {
        String s = "abc";
        subSet("",s,0);

    }
    private static void subSet(String current , String str , int index){
        if(index >= str.length()){
            System.out.println(current);
            return;
        }
        subSet(current,str,index+1);
        subSet(current+str.charAt(index),str,index+1);
    }
}
