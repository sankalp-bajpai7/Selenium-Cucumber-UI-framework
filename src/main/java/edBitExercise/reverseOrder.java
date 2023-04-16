package edBitExercise;

public class reverseOrder {

    public static String reverse(final String str) {

        StringBuffer sb = new StringBuffer(str);
        String finalString = String.valueOf(sb.reverse());


        return finalString;
    }

    public static void main(String[] args) {
        String s1 = "Hello world";
        System.out.println("Reversed string: " +reverse(s1));
    }
}
