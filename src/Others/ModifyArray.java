package Others;
/*
you have to tell minimum swaps required to modify array in a such that for every i from 0 to |a|-1 we have i%3== a[i]%3
 */
// 3 5 4

public class ModifyArray {
    public static void main(String[] args) {

    }
    private static int[] swap(int firstPos , int secondPos , int[] array){
        int temp = array[firstPos];
        array[firstPos] = array[secondPos];
        array[secondPos] = temp;
        return array;
    }

    private static int modification(int[] array){
        int swapCount = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i]%3!=i%3){

            }
        }
        return swapCount;
    }
}
