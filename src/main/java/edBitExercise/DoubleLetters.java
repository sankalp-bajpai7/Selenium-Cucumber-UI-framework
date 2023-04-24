package edBitExercise;

public class DoubleLetters {

    public static boolean doubleLetters(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String words = "chicken";
        System.out.println(doubleLetters(words));

    }

}
