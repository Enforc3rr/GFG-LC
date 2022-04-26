package Recursion;

public class MaxNumber {
    public static void main(String[] args) {
        int [] arr = {1,3,2,5,4};
        System.out.println(maxNumber(arr,0));
    }

    private static int maxNumber(int [] arr , int index){
        if(index == arr.length){
            return 0;
        }
        return Math.max(arr[index],maxNumber(arr,index+1));
    }
}
