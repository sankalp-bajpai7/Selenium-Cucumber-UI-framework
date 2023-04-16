package edBitExercise;

import org.apache.poi.ss.formula.atp.Switch;

public class fizBuzz {

    public static String fizzBuzz(int n) {
        int q1 = n%3;
        int q2 = n%5;


        if (q1==0 && q2 >0) {
            return "Fizz";
        } else if (q1>0 &&q2==0) {
            return "Buzz";
        } else if (q1==0 && q2 ==0) {
            return "FizzBuzz";
        } else {
            return String.valueOf(n);
        }


    }

    public static void main (String[] args) {
        int num = 4;
        System.out.println(fizzBuzz(num));

    }
}
