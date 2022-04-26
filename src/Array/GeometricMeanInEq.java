package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class GeometricMeanInEq {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int total = Integer.parseInt(br.readLine());

//        for(int i = 0 ; i < total ; i++){
            int inputSize = Integer.parseInt(br.readLine());
            String [] input = br.readLine().split(" ");

            if(inputSize>1){
                HashMap<Integer,Integer> map = new HashMap<>();
                for(String element : input){
                    map.put(Integer.parseInt(element),map.getOrDefault(Integer.parseInt(element),0)+1);
                }
                int countOne = map.getOrDefault(1,0);
                int countMinusOne = map.getOrDefault(-1,0);

                if(Math.abs(countOne-countMinusOne)==1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }
    }
