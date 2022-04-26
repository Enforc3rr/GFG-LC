package Recursion;
//Name of question should be Decreasing-Increasing
public class IncreasingDecreasing {
    public static void main(String[] args) {
        printDecrIncr(5);
    }
    public static void printDecrIncr(int n){
        if(n==0)
            return;
        System.out.println(n);
        printDecrIncr(n-1);
        System.out.println(n);
    }
}
