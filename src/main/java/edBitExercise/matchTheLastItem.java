package edBitExercise;

public class matchTheLastItem {
    public static boolean checkLast(String[] s) {

        String concatenated = "";

        for (int i = 0; i<s.length-1;i++) {
                concatenated += s[i];
        }

        return concatenated.equals(s[s.length-1]);

    }

    public static void main (String[] args) {
        String[] str = {"i", "am", "into", "her", "world", "iamintoherworld"};
        boolean res = checkLast(str);
        System.out.println(res);
    }


}
