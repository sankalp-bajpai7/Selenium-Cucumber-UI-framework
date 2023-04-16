package edBitExercise;

import java.util.Arrays;

public class maxPossibleTotal {


    public static int maxTotal(int[] a1) {
        int total = 0;
        Arrays.sort(a1);
        for (int i = 5; i<a1.length; i++) {
                total += a1[i];
        }

        return total;
    }

    public static void main (String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,10} ;
        int maxTotal = maxTotal(array);
        System.out.println(maxTotal);
    }
}
