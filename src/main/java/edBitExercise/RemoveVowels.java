package edBitExercise;

public class RemoveVowels {

    public static String removeVowels(String s) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            //Check if 'c' is a vowel, for a vowel - index would be 0 or greater than 0
            //If its -1, then 'c' doesnt occur inside vowels
            if (vowels.indexOf(c) == -1){
                result.append(c);
            }
        }
        return result.toString();

    }

    public static int countVowels(String a) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i<a.length(); i++) {
            char c = a.charAt(i);
            if (vowels.indexOf(c) >=0) {
                count++;
            }
        }
        return count;
    }

    public static void main (String[] args) {
       // String s = "I have never seen a thin person drinking Diet Coke.";
        String s = "dfgaeihjkl";
        String result  = removeVowels(s);
        System.out.println(result);
        int vowelcount = countVowels(s);
        System.out.println(vowelcount);


    }


}
