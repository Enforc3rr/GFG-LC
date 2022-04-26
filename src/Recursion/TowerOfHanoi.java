package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {

    }
    private static void towerOfHan(int n , int t1 , int t2 , int t3){
        if(n==0)
            return;
        towerOfHan(n-1,t1,t3,t2);
        System.out.println(n + t1 + t2);
        towerOfHan(n-1,t3,t2,t1);
    }
}
