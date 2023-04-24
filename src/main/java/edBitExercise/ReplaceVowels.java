package edBitExercise;

public class ReplaceVowels {

        public static String replaceVowels(String str, char ch) {
            return str.replaceAll("[aeiouAEIOU]", String.valueOf(ch));
        }

    public static void main(String[] args) {
        String s = "the aardvark";
        char ch = '#';
        System.out.println(replaceVowels(s,ch));
    }
}
