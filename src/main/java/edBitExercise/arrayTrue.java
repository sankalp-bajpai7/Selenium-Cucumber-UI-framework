package edBitExercise;

public class arrayTrue {

    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i]) {
                count ++;
            }
        }
        return count;
    }

    public static void main (String[] args) {
        boolean[] myArray = {true,true,true,true,false};
        int trueCount = countTrue(myArray);
        System.out.println(trueCount);
    }
}
