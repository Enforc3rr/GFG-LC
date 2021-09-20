package Array;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int [] array1 = {1,1};
        int [] array2 = {1,2};

        System.out.println(mergeArrays(array1,array2));

    }
    private static double mergeArrays(int [] array1 , int [] array2){
        ArrayList<Integer> arrayList = new ArrayList<>();


        for(int i : array1){
            arrayList.add(i);
        }
        for(int i : array2){
            arrayList.add(i);
        }
        Collections.sort(arrayList);

        if(arrayList.size()%2==0){
            int size = arrayList.size();
            return (arrayList.get(size/2) + arrayList.get((size/2) - 1  )) / 2.0 ;
        }else{
            return arrayList.get(arrayList.size()/2);
        }
    }
}
