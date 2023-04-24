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

    public static void main (String[] args) {
       // String s = "I have never seen a thin person drinking Diet Coke.";
        String s = "dfghjkl";
        String result  = removeVowels(s);
        System.out.println(result);


    }


}
