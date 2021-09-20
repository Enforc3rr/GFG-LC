package DynamicProg;
// 0 1 1 2 3 5 8 13
public class FiboNumber {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
    private static int fib(int n) {
        return fiboRec(0,1,n);
    }

    private static int fiboRec(int first , int second , int numberOfTimesLoop ){
        if (numberOfTimesLoop > 0){
            int newSecond = first + second ;
            numberOfTimesLoop--;
            return fiboRec(second , newSecond ,numberOfTimesLoop);
        }
        return first;
    }

    private static void fiboDp(int n,int[] memo){

    }
}
