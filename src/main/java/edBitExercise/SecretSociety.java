package edBitExercise;

import java.util.Arrays;

public class SecretSociety {

    public static String secretName(String[] names) {
        StringBuilder sb = new StringBuilder();
        for (String name: names) {
            sb.append(name.charAt(0));
        }
            char[] letters = sb.toString().toCharArray();
            Arrays.sort(letters);

        return new String(letters);
    }

    public static void main(String[] args) {
        String[] name1 = {"Adam", "Sarah", "Malcolm"};
        System.out.println(secretName(name1));
    }

}
