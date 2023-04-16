package valid;

import java.util.Scanner;

public class countWords {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)) && !isWord) {
                isWord = true;
                wordCount++;
            } else if (!Character.isLetter(input.charAt(i))) {
                isWord = false;
            }
        }

        System.out.println("Word count: " + wordCount);
    }


    }

