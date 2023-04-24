package edBitExercise;

public class StringSplosion {

    public String stringSplosion(String str) {
        String result = "";

        for (int i = 0; i<str.length();i++) {

            result = result+str.substring(0,i+1);
        }

        return result;
    }

    public static void main(String[] args) {

        StringSplosion stringSplosion = new StringSplosion();
        String s = "abc";
        System.out.println(stringSplosion.stringSplosion(s));


    }

}
