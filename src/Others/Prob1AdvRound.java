package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prob1AdvRound {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] arr = new int[]{1,3,2,5,1};
        for(int i :  arr){
            list.add(i);
        }
        System.out.println(numOfOperations(arr.length , list));
    }

    public static int numOfOperations(int N , List<Integer> list){
        int count = 0;
        Collections.sort(list);
        for(int i = 0 ; i < list.size()-1 ; i++){
            if(list.get(i)==list.get(i+1)){
                list.add(i+1,list.remove(i)*2);
                count++;
            }
        }
        return count;
    }
}
