package edBitExercise;

public class captureRook {


    public static boolean canCapture(String[] rooks) {
        int x1 = Character.getNumericValue(rooks[0].charAt(0));
        int y1 = Character.getNumericValue(rooks[0].charAt(1));
        int x2 = Character.getNumericValue(rooks[1].charAt(0));
        int y2 = Character.getNumericValue(rooks[1].charAt(1));

        if (x1 == x2 || y1==y2) {
            return true;
        } else {
            return false;
        }

    }

    public static void main (String[] args) {
        String[] rookSet = {"A4", "B3"};
        boolean res = canCapture(rookSet);
        System.out.println(res);
    }

}
