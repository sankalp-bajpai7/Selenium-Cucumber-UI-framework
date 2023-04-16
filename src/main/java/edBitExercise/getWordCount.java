package edBitExercise;

public class getWordCount {

    public static int countTrue(String s) {
        int count = 0;
        //word = "Just an example here move along";
        String [] wordArray = s.split(" ");

        for (int i = 0; i<wordArray.length; i++) {
            if (wordArray[i] != "") {
                count ++;
            }
        }

        return count;
    }
public static void main (String[] args) {
    String words = "Just an example here move along how about this now?";
    int wordCounts = countTrue(words);
    System.out.println("Word count : " +wordCounts);
}

//    public static int countTrue(boolean[] arr) {
//        int count = 0;
//        for (int i =0; i< arr.length;i++) {
//            if (arr[i]) {
//                count++;
//            }
//        }
//
//        return count;
//    }
//
//    public static void main (String[] args) {
//        boolean[] myarray = {true, false, false, true, false};
//        int wordCounts = countTrue(myarray);
//        System.out.println("Word count : " +wordCounts);
//    }

}
