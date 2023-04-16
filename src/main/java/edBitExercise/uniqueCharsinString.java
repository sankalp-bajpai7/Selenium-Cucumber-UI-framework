package edBitExercise;

import java.util.HashSet;

public class uniqueCharsinString {


    public static void uniqueChars(String str) {
        HashSet<Character> uniqueCharacters = new HashSet<>();

        for (int i = 0; i<str.length();i++) {
            char ch = str.charAt(i);
            if(!uniqueCharacters.contains(ch)) {
                uniqueCharacters.add(ch);

            }

        }
        for(char ch:uniqueCharacters) {
            System.out.println(ch+ " ");
        }

    }

    public static void main(String[] args) {
        String s = "Hello worlds" ;
        String p = "";
        uniqueChars(p);
    }
}
