package Others;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class IPLMatch {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int [] arr =
    } 
    static ArrayList<Integer> maxSubArray(int arr[], int n, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = Integer.MIN_VALUE ;
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for(int i = 0 ; i < k ; i++){
            queue.add(arr[i]);
            max = Math.max(max , arr[i]);
        }
        arrayList.add(max);

        for(int i = k ; i < n ; i++){
            queue.removeFirst();
            queue.addLast(arr[i]);
            max = Math.max(max,arr[i]);
            arrayList.add(max);
        }
        return arrayList;
    }
}
