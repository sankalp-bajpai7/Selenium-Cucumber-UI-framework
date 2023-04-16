package edBitExercise;

public class findWordinString {

    public static String bomb(String str) {

        if (str.contains("bomb")) {
            return "DUCK!" ;
        }
        else
        return "Relax, there's no bomb.";
    }

    public static void main(String[] args) {
        String actual = "There is a bomb";
        System.out.println(bomb(actual));
    }
}
