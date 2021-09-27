package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(253));
    }
    public static int sumOfDigits(int numb){
        if(numb <= 0){
            return 0;
        }else{
            return numb%10 + sumOfDigits(numb/10);
        }
    }
}
