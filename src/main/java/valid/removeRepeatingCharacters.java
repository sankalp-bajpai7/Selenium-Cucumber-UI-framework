package valid;

public class removeRepeatingCharacters {

    public static void main (String[] args) {
        String a = "The quick brown fox jumps over the lazy dog";
        String ch = firstNonrepeatingCharacter(a);
      System.out.println("Strung with repeating charactes: "+a);
      System.out.println("String without repeating characters : " +ch);
    }


    public static String firstNonrepeatingCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] isSeen = new boolean[256];
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (!isSeen[ch]) {
                sb.append(ch);
                isSeen[ch] = true;
            }
        }

        return sb.toString();
    }
}
