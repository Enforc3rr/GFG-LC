package Array;

import java.util.Arrays;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] array = {4,5,6,7,0,1,2};
        int target = 0 ;
        int max = 0 ;
        for(int i = 0 ; i < array.length-1 ; i++){
            if(array[i]>array[i+1]){
                max = i;
                break;
            }
        }
    }
    private static void breaking(int[] array,int breakPoint,int target){

    }
    public static int[] getSlice(int[] array, int startIndex, int endIndex)
    {
        int[] slicedArray = new int[endIndex - startIndex];
        System.arraycopy(array, startIndex, slicedArray, 0, slicedArray.length);
        return slicedArray;
    }
}
