package valid;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

   static String isOrdered (String str) {
       char [] charArray = str.toCharArray();
       Arrays.sort(charArray);
       String sortedStr = new String(charArray);
       return sortedStr;
   }

    static boolean isAnagram(String a, String b) {
       boolean isAnagram = false;
       if (a.length() == b.length()) {
           String sortedA = isOrdered(a.toLowerCase());
           String sortedB = isOrdered(b.toLowerCase());
           if (sortedA.equals(sortedB)) {
               isAnagram = true;
           }
       }
       return isAnagram;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
