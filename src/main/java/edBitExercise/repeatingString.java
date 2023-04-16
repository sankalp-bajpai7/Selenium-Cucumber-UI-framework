package edBitExercise;

public class repeatingString {

    public static String doubleChar(String s) {
        String repeat = "";

        for (int i = 0; i < s.length(); i++) {
        repeat = repeat+s.substring(i,i+1) + s.substring(i,i+1);
        }
        return repeat;
    }

    public static void main (String[] args) {
        String str = "JAVA";
        String result = doubleChar(str);
        System.out.println(result);

    }
}
