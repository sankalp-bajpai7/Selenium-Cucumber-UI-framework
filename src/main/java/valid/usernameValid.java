package valid;


import java.io.*;
import java.util.*;


public class usernameValid {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a username");
            String username = input.nextLine();
            int testCases = Integer.parseInt(input.nextLine());
            //if username is valid then print the statements

        if ( isUsernameValid(username)) {
            System.out.println("Username is valid");
        }
        else {
            System.out.println("Username is invalid");
        }
    }

    public static boolean isUsernameValid(String username) {
            int length = username.length();
            if (length < 8 || length > 30) {
                return false;
            }

            for (int i=0; i<length ; i++) {
                Character ch = username.charAt(i);
                if (!Character.isLetterOrDigit(ch) && ch != '_') {
                    return false;
                }
            }

            Character firstChar = username.charAt(0);
            if (!Character.isLetter(firstChar)) {
                return false;
            }

            return true;
    }
}
