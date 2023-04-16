package edBitExercise;

import java.util.Arrays;
import java.util.Collections;

public class maxMinArray {

    public static int maxMinDiff(int[]arr) {
        //finding biggest and smallest number in array
        //sort the array
        Arrays.sort(arr);
        int diff = arr[arr.length-1] - arr[0] ;

        return diff;
    }

    public static void main (String[] args) {
        int[] array = {44, 32, 86, 19};
        System.out.println("Difference between largest and smallest number is : " +maxMinDiff(array));
    }
}
