package edBitExercise;

public class existsHigher {

    public static boolean existsHigher(int[] arr, int n) {
        for (int i = 0; i<arr.length ; i++) {
            if (arr[i] >= n) {
                return true;
            }
        }
        return false;
    }

    public static void main (String[] args) {

        int[] array1= {5,3,15,22,4} ;
        int numcheck = 10;
        boolean res = existsHigher(array1,numcheck);
        System.out.println(res);
    }
}
