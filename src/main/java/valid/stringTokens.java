package valid;

import java.util.Scanner;

public class stringTokens {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();

        String s = "He is a very very good boy, isn't he?";



        //splits a string s into an array of substrings using a regular expression that matches
        // one or more occurrences of the following
        // characters: space, comma, exclamation mark, question mark, period, underscore, single quote, at symbol.
        //The + symbol means "one or more"

       String[] r =  s.split("[ ,!?._'@]+");
       System.out.println(r.length);
       for (String a : r) {
           System.out.println(a);
       }
        //scan.close();


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }


}
