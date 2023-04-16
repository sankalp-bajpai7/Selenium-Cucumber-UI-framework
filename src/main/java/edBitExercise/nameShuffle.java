package edBitExercise;

public class nameShuffle {

    public static String nameShuffle(String s) {
        String[] divided = s.split(" ") ;
        String a = divided[0];
        String b = divided[1];
        String finalString = b + " " + a;

        return finalString;

    }

    public static void main (String[] args) {
        String c = "Hello world";
        System.out.println(nameShuffle(c));
    }
}
