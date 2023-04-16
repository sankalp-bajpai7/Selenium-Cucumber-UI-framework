package valid;

public class containsWords {

    public static void main (String []args) {
        String a = "May I take your order";
        String b = "TAKE";

        Boolean bT = a.toLowerCase().contains(b.toLowerCase());
        System.out.println(bT);

        int iN = a.toLowerCase().indexOf(b.toLowerCase());
        if (iN == -1) {
            System.out.println("take not found");

        } else {
            System.out.println("Word found at: " + iN);
        }
    }

}
