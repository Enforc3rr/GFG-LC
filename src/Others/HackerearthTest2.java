package Others;

import java.util.*;

public class HackerearthTest2 {
    public static void main(String[] args) {
//        group_Sol(5 , new int[]{1,2,2,1,6});
        System.out.println(Math.pow(3,2));
        double b = 2.3231;
        System.out.println((int)b);
//        int a = 100;
        int x =3 , y = 5 , z = 10;
        System.out.println(++z + y - y + z + x++);
        System.out.println(x);

        byte p = 127;
        p++;
        p++;
        System.out.println(p);

    }

    static int[] group_Sol(int N , int[] a){

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int numb : a){
            map.put(numb , map.getOrDefault(numb,0)+1);
        }
        int [] sol = new int[map.size()];


        List<Integer> list = new ArrayList<Integer>();
        list.add(16);
        list.get(0);
        for(Map.Entry<Integer , Integer> e  : map.entrySet()){

        }


        return  sol;
    }
}

