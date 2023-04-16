package valid;

public class verifySingleChar {

    public static void main (String[] args) {
        String str = "Java exercise";
        boolean res = false;
        for (int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == 'x') {
                res = true;
                break;
            }

        }
        System.out.println(res);

    }

}
