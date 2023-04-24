package edBitExercise;

public class SpaceBetweenLetters {


    public static String spaceMeOut(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            sb.append(c).append(' ');
        }
            sb.setLength(sb.length()-1);
            return sb.toString();
    }

    public static void main(String[] args) {
        String s = "elongated musk";
        System.out.println(spaceMeOut(s));
    }
}
