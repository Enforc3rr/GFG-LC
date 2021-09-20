package Others;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UncommonAlpha {
    public static void main(String[] args) {
        char[] s1 = {'A','B','C'};
        char[] s2 = {'B','C'};
        uncommonAlpha(s1,s2);
    }

    private static void uncommonAlpha(char[] i1 , char[] i2) {

        HashSet<Character> set1 = new HashSet<>();
        for (Character s : i2) {
            set1.add(s);
        }
        int sum = 0;
        for (Character s : i1) {
            if (!set1.contains(s)) {
                sum = sum + (int) s;
            }
        }
        int singleDigit = 0;
        for(int i = 0  ; i < 2 ; i++){
            while (sum > 10) {
                System.out.println(sum);
                singleDigit = singleDigit + sum % 10;
                sum = sum / 10;
            }
            sum = singleDigit;
        }

        System.out.println(singleDigit);
    }



     public int findKey(int i1 , int i2 , int i3){
        int hundred = Integer.parseInt(String.valueOf(i1).split("")[1]);
        int tens = Integer.parseInt(String.valueOf(i2).split("")[2]);

        int[] i3Array = new int[4];
        int count = 0 ;

        while (i3 > 0) {
            i3Array[count]= i3 % 10;
            i3 = i3 / 10;
            count++;
        }
        int max = Arrays.stream(i3Array).max().getAsInt();


        return (hundred*tens) - max;
    }
}
