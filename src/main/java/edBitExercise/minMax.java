package edBitExercise;

import java.util.Arrays;

public class minMax {

    public static int[]minMax(int[] a) {

        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length-1];
        int[] finalarray = {min, max};
        return finalarray;

    }

    public static void main (String[] args) {

        int[]myarray = {1,3,25,52,1};
        int[] result = minMax(myarray);
        System.out.println("Min and Max numbers are :" +Arrays.toString(result));

    }

}
