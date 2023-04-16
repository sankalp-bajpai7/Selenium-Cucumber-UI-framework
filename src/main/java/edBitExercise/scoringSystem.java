package edBitExercise;

import java.util.Arrays;

public class scoringSystem {


    public static int[] calculateScores(String s) {
        //iterate through the string length and validate characters at each position
        //Can also be done using switch case

        int[] scores = new int[3];
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int i = 0; i<s.length(); i++)  {
            char c = s.charAt(i);
            if (c=='A') {
                c1++;
            }
            if (c=='B') {
                c2++;
            }
            if (c=='C') {
                c3++;
            }
        }

//        for (int i =0; i<s.length() ; i++) {
//            char c = s.charAt(i);
//            switch(c) {
//                case 'A':
//                scores[0]++;
//                break;
//                case 'B':
//                scores[1]++;
//                break;
//                case 'C':
//                scores[2]++;
//                break;
//                default:
//                //break
//
//            }
//        }
        int[] array1 = {c1,c2,c3};

        return array1;
    }

    public static void main(String[] args) {

        String score = "ABCACC";
        int[] finalscore = calculateScores(score);
        System.out.println("Final score is: " + Arrays.toString(finalscore));

    }

}
