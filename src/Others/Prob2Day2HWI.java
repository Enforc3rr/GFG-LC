package Others;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Prob2Day2HWI {
    public static void main(String[] args) {
        System.out.println(arrangement(new int[]{4,1,1,4},4));
    }
    public static int arrangement(int [] A , int N){
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        
        for(int ele : A){
            treeMap.put(ele,treeMap.getOrDefault(ele,0)+1);
        }
        int max,min;
        if(treeMap.get(treeMap.firstKey())>=treeMap.get(treeMap.lastKey())){
           max = treeMap.firstKey();
           min = treeMap.lastKey();
        }else{
            min = treeMap.firstKey();
            max = treeMap.lastKey();
        }

        return Math.abs(max-min)*segregate(A,N,min,max);
    }
    static int segregate(int[] arr, int n , int a , int b)
    {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == a)
                count++;
        }
        for (int i = 0; i < count; i++)
            arr[i] = a;
        for (int i = count; i < n; i++)
            arr[i] = b;

        return count;
    }
}
