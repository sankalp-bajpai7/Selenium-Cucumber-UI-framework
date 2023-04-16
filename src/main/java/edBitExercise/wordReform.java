package edBitExercise;

public class wordReform {

    public static String getWord(String left, String right) {
        String word1 = left + right;
        char[] charArray2 = word1.toCharArray();
        String firstChar = String.valueOf(charArray2[0]).toUpperCase();
        String finalWord = firstChar+left.substring(1)+right;

        return finalWord;

    }

    public static void main (String[] args) {
        String left1 = "seas";
        String right1 = "onal";
        System.out.println(getWord(left1,right1));
    }

}
