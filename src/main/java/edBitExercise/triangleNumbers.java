package edBitExercise;

public class triangleNumbers {

    public static int triangle(int n) {

        int sum = 0;
        for (int i = 0; i<=n ; i++ ) {
            sum +=i;
        }

        return sum;
    }

    public static void main (String[] args) {
        int number = 6;
        //System.out.println("triangle(" +triangle(number)+ ")");
        System.out.println("triangle(" +number+") :"+triangle(number));
    }
}
