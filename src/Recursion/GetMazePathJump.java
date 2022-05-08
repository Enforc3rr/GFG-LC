package Recursion;

import java.util.ArrayList;

public class GetMazePathJump {
    public static void main(String[] args) {
        System.out.println(getMazePathJump(1,1,4,4));
    }
    private static ArrayList<String> getMazePathJump(int x, int y, int dx, int dy){
        if(x==dx || dy == y){
            ArrayList<String> baseCaseList = new ArrayList<>();
            baseCaseList.add("");
            return baseCaseList;
        }
        if(x>dx || y > dy)
            return new ArrayList<>();

        ArrayList<String> result = new ArrayList<>();

        for(int i = 1 ; i < dx-x ; i++){
            ArrayList<String> horizontalPath = getMazePathJump(x+i,y,dx,dy);
            for(String path : horizontalPath)
                result.add("h"+path);
        }
        for(int i = y ; i < dy-y ; i++){
            ArrayList<String> verticalPath = getMazePathJump(x,i+y,dx,dy);
            for(String path : verticalPath)
                result.add("v"+path);
        }


//        for(String path : horizontalPath)
//            result.add("h"+path);
        return result;
    }
}
