package edBitExercise;

public class xAndOs {

    public static boolean getXO(String str) {
        int count1 =0;
        int count = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i< charArray.length; i++) {
          if (charArray[i] == 'x' || charArray[i] == 'X'){
              count++;
          }
          if (charArray[i] == 'o' || charArray[i] == 'O') {
              count1++;
          }
        }
        if (count1==count) {
            return true;
        }
        if (count1==0 && count==0) {
            return true;
        }
//        if (count1>count || count>count1) {
//            return false;
//        }
        else return false;

    }
        //More effective manner is to use regex and remove all the x's and o's from the string and then count the length
//        public static boolean sameXAndO(String str) {
//            // Count the number of x's and o's in the string using regular expressions
//            int numX = str.replaceAll("[^xX]", "").length(); //replacing all the words that are not x or X
//            int numO = str.replaceAll("[^oO]", "").length();
//
//            // Return true if the counts are equal, false otherwise
//            return numX == numO;
//        }
    public static void main (String[] args) {
        String s = "zpzpzpp";
        System.out.println("are x and O in same number? :" +getXO(s));
    }
}
