package Recursion;

public class FibonacciRec {
    //0 1 1 2 3 5 8 13 ....
    public static void main(String[] args) {
        System.out.println(fiboRec(6));
    }
    public static int fiboRec(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
            return fiboRec(n-1)+fiboRec(n-2);
        }
    }

