package valid;

public class countUpperLowerCase {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("ThiS iS A loWEr AnD UpPER Case couNT");
        uPlowCount(str);
    }

     static char uPlowCount(StringBuffer str) {
        int upCount = 0;
        int lowCount = 0;

        for (int i = 0; i< str.length(); i++) {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                lowCount+=1;
                str.append(i);
            } else if (Character.isUpperCase(c)) {
                upCount+=1;
                str.append(i);
            }
        }
         System.out.println("Lower case count: " +lowCount);
         System.out.println("Upper case count: " +upCount);

         return 0;
     }

}
