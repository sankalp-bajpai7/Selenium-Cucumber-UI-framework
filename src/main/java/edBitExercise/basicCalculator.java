package edBitExercise;

public class basicCalculator {

    public static int calculator (int n1, char op, int n2) {
        int result = 0;
        switch (op) {
            case '+':
                result = n1 + n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/' :
                if (n2 ==0) {
                    System.out.println("Error dividing by 0");
                }
                else {
                    result = n1 / n2;
                }
                break;

        }
        return result;
    }

    public static void main (String[] args) {
        int num1 = 2;
        int num2 = 16;
        char operator = '*';
        System.out.println("Result : " +calculator(num1,operator,num2));

    }
}
