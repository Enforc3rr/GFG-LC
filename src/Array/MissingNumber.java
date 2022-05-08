package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String[] inputArray = br.readLine().split(" ");
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(String ele : inputArray){
            treeSet.add(Integer.parseInt(ele));
        }
        for(int i = 1 ; i <= number ; i++){
            if(!treeSet.contains(i))
                System.out.print(i);
        }
    }
}
