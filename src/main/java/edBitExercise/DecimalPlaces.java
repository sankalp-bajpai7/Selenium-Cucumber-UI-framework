package edBitExercise;

public class DecimalPlaces {

    public static int getDecimalPlaces(String num) {
        int decimalIndex = num.indexOf(".");
        if (decimalIndex == -1) {
            return 0;
        }
        int length = num.length()-decimalIndex-1;
        return length;

    }


    public static void main(String[] args) {
        String num = "3.141529";
        System.out.println(getDecimalPlaces(num));
    }
}
