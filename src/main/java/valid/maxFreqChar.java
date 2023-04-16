package valid;

public class maxFreqChar {

    public static void main (String[] args) {
        String str = "Hello World";
        char ch = findMaxChar(str);
        System.out.println("max occuring char is:" +ch );


    }

    public static char findMaxChar(String str) {
        int[] count = new int[256];
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        char maxChar = '\0';
        int maxCount = 0;
        for (int i = 0; i < count.length; i++)
        {
            if(count[i]>maxCount) {
                maxChar = (char) i;
                maxCount = count[i];

            }

        }


        return maxChar;
    }



}
