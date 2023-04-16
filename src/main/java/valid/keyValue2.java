package valid;

import java.util.*;

public class keyValue2 {

    public static void main (String[] args) {
        Map<String, String> newMap = new HashMap<>();
        newMap.put("apple", "red");
        newMap.put("banana", "yellow");
        newMap.put("cherry", "red");

        String[] values = getValues(newMap);
        System.out.println(Arrays.toString(values));
    }


    public static String[] getValues(Map<String, String> dict) {
        //create a String List to hold and sort keys
        List<String> sortedKeys = new ArrayList<>(dict.keySet());
        Collections.sort(sortedKeys);
        //create a string array to set values corresponding to keys
        String[] values  = new String[sortedKeys.size()];
        //iterate through the string array to put values to keys
        for (int i =0; i< sortedKeys.size(); i++) {
            values [i] = dict.get(sortedKeys.get(i));
        }

        return values;
    }
}
