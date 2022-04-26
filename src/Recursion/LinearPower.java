package Recursion;

public class LinearPower {
    public static void main(String[] args) {
        System.out.println(powerLinear(2,3));
    }
    private static int powerLinear(int x , int n){
        if(n==1)
            return x;
        return x * powerLinear(x,n-1);
    }
}
