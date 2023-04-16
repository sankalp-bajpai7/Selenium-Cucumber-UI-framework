package edBitExercise;

public class programmers {

    public static int maxMinProg(int a, int b, int c) {
        int maxWage = Math.max(a, Math.max(b,c));
        int minWage = Math.min(a, Math.min(b,c));
        return maxWage-minWage;


    }

    public static void main(String[] args) {
        int p1 = 147;
        int p2 = 33;
        int p3= 526;
        System.out.println("diff between max and min is: " +maxMinProg(p1,p2,p3));
    }
}
