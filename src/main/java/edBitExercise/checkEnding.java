package edBitExercise;

public class checkEnding {

    public static boolean checkEndings(String a, String b) {

        if (a.endsWith(b)) {
            return true;
        }
        else {
            return false;
        }

//        int l = a.length();
//        String sub = a.substring(l-2,l);
//            System.out.println(sub);
//            if (!sub.equalsIgnoreCase(b)) {
//                return false;
//            }


    }

    public static void main (String[] args) {
        String mainString = "abc";
        String secString = "bc";
       boolean result = checkEndings(mainString, secString);
       // boolean result2 = mainString.endsWith(secString);
        System.out.println(result);
    }
}
