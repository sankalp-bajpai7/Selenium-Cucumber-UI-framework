package edBitExercise;

public class sayHelloSayBye {

    public static String sayHelloBye(String str, int num) {
        if(num==1) {

            str = "Hello " + String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1);
        }
        if (num==0) {
            str = "Bye " + String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1);;
        }


        return str;
    }

    public static void main (String[] args) {
        String name = "Alan";
        int number = 0;
        System.out.println(sayHelloBye(name, number));
    }
}
