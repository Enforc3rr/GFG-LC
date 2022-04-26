package Recursion;

public class FibonacciUsingRec {
    public static void main(String[] args) {
//        System.out.println("Fibonacci Recursively :");
        fibRec(5);
        System.out.println("Fibonacci Iteratively :");
        fibItr(5);
    }

    private static int fibRec(int N){
        if(N==1){
            return 1;
        }
        if(N==0){
            return 0;
        }
        return fibRec(N-1) + fibRec(N-2);
    }
    private static void fibItr(int N){
        int n1 = 0 ; int n2 = 1;
        int prevN2 = 1;
        System.out.print(0 + " " + 1 + " ");
        while (N > 0) {
            prevN2 = n2;
            System.out.print(n1+n2 + " ");
            n2 = n1 + n2 ;
            n1 = prevN2;
            N--;
        }
    }
}
