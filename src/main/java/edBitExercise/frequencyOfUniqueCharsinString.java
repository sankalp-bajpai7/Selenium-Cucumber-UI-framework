package edBitExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class frequencyOfUniqueCharsinString {

    public static void main(String[] args) {
        String str = "Hello world";
        Map<Character,Integer> charFreq = new HashMap<>();

        //iterate over each character in the string
        for (int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);

            //check if the hashmap already contains the character
            if(charFreq.containsKey(c)) {
                //if yes then increase the count of that character by 1
                charFreq.put(c, charFreq.get(c)+1);
            }
            //if not then add the character with the count as 1
            else{
                charFreq.put(c,1);
            }
        }

        //iterate over the map and print unique chars and frequency
        for(Map.Entry<Character,Integer> entry : charFreq.entrySet()) {
            if(entry.getValue() ==1) {
                System.out.println("Unique character: " + entry.getKey());
            } else {
                System.out.println("Character: " +entry.getKey() + "Frequency: " +entry.getValue() );
            }
        }
    }
}
