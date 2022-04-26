package Recursion;

public class PrintArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
//        func(arr,0);
        rev(arr,arr.length-1);
    }
    public static void func(int[] arr , int idx){
        if (arr.length == idx)
            return;
        System.out.println(arr[idx]);
        func(arr,idx+1);
    }

    public static void rev(int[] arr , int idx){
        if (idx == -1)
            return;
        System.out.println(arr[idx]);
        rev(arr,idx-1);
    }
}
