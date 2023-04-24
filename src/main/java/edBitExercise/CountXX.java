package edBitExercise;

import org.checkerframework.checker.units.qual.C;

public class CountXX {

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
            //abcxx
        }
        return count;
    }

    public static void main(String[]args) {
        String s = "abcxx";
        CountXX countXX = new CountXX();
        System.out.println("Count is:" +countXX.countXX(s));

    }



}
