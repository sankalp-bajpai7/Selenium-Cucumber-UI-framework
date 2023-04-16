package valid;

public class nonrepeatingCharacters {

    public static void main (String[] args) {
        String a = "JAVA";
        String b = "JAVA";

        for (int i = 0; i<a.length(); i++) {
            boolean u = true;
            for (int j = 0; j<a.length(); j++) {
                if (i!=j && a.charAt(i) == a.charAt(j) ) {
                    u = false;
                    break;
                }

            }

            if(u) {
                System.out.println(a.charAt(i));
            }

        }
    }
//        char ch = firstNonrepeatingCharacter(b);
//        System.out.println("Repeating characters in the string is : " +ch);
    }

//    public static char firstNonrepeatingCharacter(String str) {
//
//        int [] count = new int[256];
//        for (int i =0; i <str.length(); i++) {
//            char ch = str.charAt(i);
//            count[ch]++;
//        }
//
//        for (int i = 0; i<str.length(); i++) {
//            char ch = str.charAt(i);
//            if (count[ch] > 1) {
//                return  ch;
//            }
//        }
//        return '\0';
//    }

