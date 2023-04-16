package edBitExercise;

public class countVowels {

//    public static int countVowels(String str) {
//        int count = 0;
//        for (int i = 0; i <= str.length()-1; i++) {
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
//                count++;
//            }
//
//        }
//        return count;
//    }

    public static int getCount(String str) {
        String vowels="aeiouAEIOU";
        int count = 0;
        for (char c : str.toCharArray()) {
            if(vowels.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }

    public static void main (String[] args) {

        String a = "CelEbration";
        System.out.println("Vowels:" + getCount(a));
    }
}
