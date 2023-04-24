package edBitExercise;

public class RepeatingLetters {

    public static String repeat(String str, int n) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 0; j<n ; j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "mice";
        int n = 5;
        System.out.println(repeat(s,n));
    }

}
