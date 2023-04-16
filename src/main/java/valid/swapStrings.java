package valid;

public class swapStrings {

    public static void main (String[] args) {
        String str1 = "My name is Shady";
        String str2 = "My name is what?";

        String temp;
//        temp = str1;
//        str1 = str2;
//        str2 = temp;

        str1 = str1+str2;
        str2 = str1.substring(0,(str1.length() - str2.length()));
        str1 = str1.substring(str2.length());


        System.out.println("String 1 : " +str1);
        System.out.println("String 2 : " +str2);
    }
}
