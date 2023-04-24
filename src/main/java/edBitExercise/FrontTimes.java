package edBitExercise;

public class FrontTimes {

    public String frontTimes(String s, int n) {

        int frontLength = 3;
        if (frontLength>s.length()) {
            frontLength = s.length();
        }
        String front = s.substring(0,frontLength);

        String result = "";
        for (int i=0; i<n ; i++) {

            result = result+front;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Ch";
        int num = 3;
        FrontTimes frontTimes = new FrontTimes();
        System.out.println("New string: " +frontTimes.frontTimes(str,num));

    }
}
