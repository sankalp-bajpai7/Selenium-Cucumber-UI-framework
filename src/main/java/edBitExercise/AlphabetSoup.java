package edBitExercise;

import java.util.Arrays;

public class AlphabetSoup {

    //Create a method that takes a string and returns a string with its letters in alphabetical order.
    public static String alphabetSoup(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);

    }

    public static void main(String[] args) {
        String s1 = "javascript";
        System.out.println(alphabetSoup(s1));
    }
}
