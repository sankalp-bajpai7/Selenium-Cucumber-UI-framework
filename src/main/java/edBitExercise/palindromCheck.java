package edBitExercise;

public class palindromCheck {

    public static boolean palCheck(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String reversed = sb.toString();
        if(reversed.equals(s)) {
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {

        String s = "mom";
        System.out.println("Palindrome check: " +palCheck(s));
    }
}
