package Recursion;

import java.util.ArrayList;

public class GetMazePath {
    public static void main(String[] args) {
        System.out.println(getMazePath(1,1,3,3));
    }
    private static ArrayList<String> getMazePath(int x, int y, int dx, int dy){
        if(x==dx && y == dy){
            ArrayList<String> baseCaseList = new ArrayList<>();
            baseCaseList.add("");
            return baseCaseList;
        }

        if(x > dx || y > dy)
            return new ArrayList<>();

        ArrayList<String> verticalPath = getMazePath(x,y+1,dx,dy);
        ArrayList<String> horizontalPath = getMazePath(x+1,y,dx,dy);
        ArrayList<String> finalList = new ArrayList<>();

        for(String path : horizontalPath)
            finalList.add("h"+path);
        for(String path : verticalPath)
            finalList.add("v"+path);

        return finalList;
    }
}
