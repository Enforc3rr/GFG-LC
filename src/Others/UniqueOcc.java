package Others;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class UniqueOcc {
    public static void main(String[] args) {

    }
    private static void uniqueOcc(int[] nums){
        Hashtable<Integer , Integer> hashTable = new Hashtable<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int hashSetItr = 0 ;
        for(int i : nums){
            hashSet.add(i);
        }

        ArrayList<Integer> list = new ArrayList<Integer>(hashSet);

        for(int i = 0 ; i < nums.length ; i++){


//            hashTable.put(list.get(hashSetItr),);
        }
    }
}
