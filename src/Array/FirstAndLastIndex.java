package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FirstAndLastIndex {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        binarySearch(new int[]{5,7,7,8,8,10},0,6,8);
        System.out.println(list);
    }

    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x){
                list.add(mid);
                return binarySearch(arr,mid+1,r,x);
            }
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
