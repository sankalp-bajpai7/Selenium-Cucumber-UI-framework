package edBitExercise;

public class stutteringFunction {

    public static String stutter (String word) {
        int l = word.length();
        String res = word.substring(0,2);
        String finalResult = res+ "..." +res+ "..."+word;

        return finalResult;
    }

    public static void main (String[] args) {
        String sample = "incredible";
        System.out.println(stutter(sample+"?"));
    }
}
