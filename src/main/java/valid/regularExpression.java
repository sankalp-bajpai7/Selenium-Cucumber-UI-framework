package valid;

import java.util.Scanner;

public class regularExpression {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String username = scan.nextLine();
            if (username.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }


    }

class UsernameValidator {

        //this regular expression is created for
//        ^: Matches the start of the string
//    [a-zA-Z]: Matches any letter (lowercase or uppercase)
//    [\w]{7,29}: Matches between 7 and 29 "word characters", which are defined as letters, digits, or underscores (\w is a shorthand character class that matches any "word character")
//    $: Matches the end of the string
        public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";
}
}
