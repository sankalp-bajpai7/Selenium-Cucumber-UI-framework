package edBitExercise;

public class JoinPortions {

//    joinPath("portion1", "portion2") ➞ "portion1/portion2"
//
//    joinPath("portion1/", "portion2") ➞ "portion1/portion2"
//
//    joinPath("portion1", "/portion2") ➞ "portion1/portion2"
//
//    joinPath("portion1/", "/portion2") ➞ "portion1/portion2"


    public static String joinPath(String portion1, String portion2) {
        if(portion1.endsWith("/") && portion2.startsWith("/")) {
            return portion1 + portion2.substring(1);
        } else if (portion1.endsWith("/") || portion2.startsWith("/")) {
            return portion1+portion2;
        }
        else {
            return portion1+"/" + portion2;
        }

    }

    public static void main(String[] args) {
        String first = "/path/to/some/";
        String second = "file.txt";
        String result = joinPath(first, second);
        System.out.println(result);
    }
}
