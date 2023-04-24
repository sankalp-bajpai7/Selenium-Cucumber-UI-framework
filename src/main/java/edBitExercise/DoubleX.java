package edBitExercise;

public class DoubleX {

    boolean doubleX(String s) {
//        for (int i = 0; i<s.length()-1; i++) {
//            if (s.substring(i,i+2).equals("xx")) {
//                return true;
//            }
//            if(s.charAt(i) == 'x' && s.charAt(i+1) == 'x') {
//                return true;
//            }

        int i = s.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= s.length()) return false; // check i+1 in bounds?
        return s.substring(i+1, i+2).equals("x");

        }


    public static void main(String[] args) {
        DoubleX doubleX = new DoubleX();
        String str = "xaxxx";
        System.out.println("result: " +doubleX.doubleX(str));

    }
}
