package edBitExercise;

public class equalityValue {

    public static int equal (int a, int b, int c) {
        if (a == b && b == c) {
            return 3;
        } else if (a == b || a == c || b == c) {
            return 2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int a1 = 1;
        int b1 = 3;
        int c1 = 4;

        System.out.println(equal(a1,b1,c1));
    }
}
