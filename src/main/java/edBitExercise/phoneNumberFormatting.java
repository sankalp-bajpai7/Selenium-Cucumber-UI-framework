package edBitExercise;

public class phoneNumberFormatting {
    public static String formatPhoneNumber(int[] arr) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<arr.length; i++) {
            if(i==0) {
                sb.append("(");
            }
            sb.append(arr[i]);
            if(i==2) {
                sb.append(") ");
            }
            if (i==5) {
                sb.append("-");
            }

        }

        return sb.toString();
    }

    public static void main (String[] args) {
        int[] arr1 =  {1,2,3,4,5,6,7,8,9,0};
        String phoneNumber = formatPhoneNumber(arr1);
        System.out.println(phoneNumber);
    }

}
