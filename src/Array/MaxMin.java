package Array;

public class MaxMin {
    public static void main(String[] args) {
        int[] array = {2,3,1,5,4};
        int min = array[0];
        int max = array[0];
        for (int j : array) {
            if (j < min)
                min = j;
            else if (j > max)
                max = j;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
