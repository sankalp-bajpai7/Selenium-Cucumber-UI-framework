package edBitExercise;

public class convertMintoSec {

    public static int convert(int minutes) {

        int seconds = minutes *60;
        return seconds;
    }

    public static void main (String[] args) {
        int min = 5;
        System.out.println("number of seconds in  " +min+ "minutes is :" +convert(min));
    }
}
