package edBitExercise;

public class RemoveLettersABC {

    public static String removeABC(String s) {
        StringBuilder sb = new StringBuilder();

        String letters = "abcABC";
        for (int i = 0; i<s.length();i++) {
            char c = s.charAt(i);
            //Check if 'char' is a either a,b or c, for a vowel - index would be 0 or greater than 0
            //If its -1, then 'c' doesnt occur inside vowels
            if(letters.indexOf(c) ==-1) {
                sb.append(c);
            }

        }

        String result = sb.toString();
        return result.equals(s) ? null : result;

//        if (s == null) {
//            return null;
//        }
//        String result = s.replaceAll("[abcABC]", "");
//        //return result.isEmpty() ? null : result;
//        if (result.equals(s)) {
//            return null;
//        }
//        else return result;
    }

    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(removeABC(s));
    }
}
