package Others;

public class Prob1Day2HWI {
    public static void main(String[] args) {
        System.out.println(numberOfChanges(new int[]{2,3},2));
    }
    public static int numberOfChanges(int [] array,int N){
        int count = 0;
        for(int i = 0 ; i < N-1 ; i++ ){
            if(gcd(array[i],array[i+1])==1){
                array[i]=array[i+1];
                count++;
            }
        }
        return count;
    }
    static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}

