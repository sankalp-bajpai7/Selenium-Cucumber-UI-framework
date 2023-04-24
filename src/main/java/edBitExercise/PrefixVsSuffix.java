package edBitExercise;

public class PrefixVsSuffix {

    public static boolean isPrefix (String word, String prefix) {
        if (word.startsWith(prefix.substring(0,prefix.length()-1)))
        return true;
        else return false;

    }

    public static boolean isSuffix(String word, String suffix) {
        if (word.endsWith(suffix.substring(1)))
            return true;
        else
        return false;
    }

    public static void main(String[] args) {
        String word1 = "automation";
        String prefix1 = "auto-";
        String word2 = "arachnophobia";
        String suffix1 = "-phobia";
        System.out.println(isPrefix(word1,prefix1));
        System.out.println(isSuffix(word2,suffix1));
    }
}
