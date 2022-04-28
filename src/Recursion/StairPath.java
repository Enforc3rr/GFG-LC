package Recursion;

import java.util.ArrayList;

public class StairPath {
    public static void main(String[] args) {
        System.out.println(stairPath(3));
    }
    private static ArrayList<String> stairPath(int n){

        if(n==0){
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add(""); // we are doing this bcuz you can go from a -> a by not moving at all
            return baseCase;
        }
        if(n < 0){
            return new ArrayList<>();
        }

        ArrayList<String> pathsOne = stairPath(n-1);
        ArrayList<String> pathsTwo = stairPath(n-2);
        ArrayList<String> pathsThree = stairPath(n-3);

        ArrayList<String> result = new ArrayList<>();
        for(String path : pathsOne)
            result.add("1"+path);
        for(String path : pathsTwo)
            result.add("2"+path);
        for(String path : pathsThree)
            result.add("3"+path);

        return result;

    }
}
