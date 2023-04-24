package edBitExercise;

public class ReturnMiddleChar {


    //Create a function that takes a string and returns the middle character(s).
    // If the word's length is odd, return the middle character.
    // If the word's length is even, return the middle two characters.
    public static String getMiddle (String word) {

        StringBuilder sb = new StringBuilder();
            if (word.length()%2==0) {
                sb.append(word.charAt(word.length()/2-1)).append(word.charAt((word.length()/2)));
            }
            else {
                sb.append(word.charAt(word.length()/2));
            }
        return sb.toString();
            
//            Alternative approach using substring
//        int length = word.length();
//        if (length % 2 == 0) {
//            return word.substring(length/2-1, length/2+1);
//        } else {
//            return word.substring(length/2, length/2+1);
//        }
    }

    public static void main(String[] args) {
        String word1 = "test";
        String word2 = "testing";
        System.out.println(getMiddle(word1));
        System.out.println(getMiddle(word2));
    }
}
