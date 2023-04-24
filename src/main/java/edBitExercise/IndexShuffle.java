package edBitExercise;

public class IndexShuffle {

    public static String indexShuffle(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            if (i % 2 ==0) {
                even.append(c);
            } else {
                odd.append(c);
            }
        }
        return even.toString() + odd.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(indexShuffle(s));
    }
}
