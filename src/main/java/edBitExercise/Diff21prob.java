package edBitExercise;


public class Diff21prob {
    public int diff21(int n) {
        int diff = 21 - n;
        if (n >= 21) {
            return (n-21) *2;
        } else {
            return diff;
        }

    }

    public static void main (String[] args) {

        Diff21prob diff21prob = new Diff21prob();
        int num = 22;
        System.out.println("Difference is : " +diff21prob.diff21(num));
    }
}
