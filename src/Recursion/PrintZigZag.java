package Recursion;

public class PrintZigZag {
    public static void main(String[] args) {
        pzz(3);
    }
    public static void pzz(int n){
        if(n==0)
            return;
        System.out.println(n);
        pzz(n-1);
        System.out.println(n);
        pzz(n-1);
        System.out.println(n);
    }
}
