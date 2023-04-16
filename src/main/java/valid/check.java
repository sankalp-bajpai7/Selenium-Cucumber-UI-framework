package valid;


public class check
{

    public static void main (String[] args)
    {
        String str1 = "My name is Shady";
        Character c = str1.charAt(8);
        char[] cArray = str1.toCharArray();
        String str2 = "my";
        CharSequence cs = "name";
        StringBuffer sB = new StringBuffer(str1);
        Boolean b = str1.contentEquals(sB);
        int b1 = str2.compareToIgnoreCase(str1);
        int b2 = str2.compareTo(str1);
        String str3 = str1.substring(0,9);
        Boolean b3 = str1.contains(str2);
        Boolean b4 = str1.endsWith(str2);
        Boolean b5 = str1.startsWith(str2);
        int length = str1.length();
        System.out.println("Result " + str3);




    }


}

