package valid;

public class palindrome {

    public static void main (String[] args) {
        String a = "madam";
        String b = "mom";
        System.out.println(palindromCheck(a));
        System.out.println(palindromCheck(b));

    }

    public static boolean palindromCheck(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equals(rev)) {
            return true;
        }
        else {
            return false;
        }
    }

}
