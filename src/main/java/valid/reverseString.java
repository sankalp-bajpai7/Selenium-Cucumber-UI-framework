package valid;

import java.util.Scanner;

public class reverseString {

    public String reverseString(String str){


        String rev_word = "";
        int i = 0;
        for (i = (str.length()-1); i >=0;  i--) {
            rev_word = rev_word + str.charAt(i);

        }

        return rev_word;

    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        reverseString Rev = new reverseString();
        System.out.println("reversed string: " +Rev.reverseString(a));


}

}
