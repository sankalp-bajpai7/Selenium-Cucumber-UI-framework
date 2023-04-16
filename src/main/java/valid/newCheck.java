package valid;

public class newCheck {

    public String repeater(String str){
        String new_str ="";
        for (int i=0; i<str.length(); i++){
            new_str = new_str+ str.substring(i,i+1) + str.substring(i,i+1);
        }
        return new_str;


    }

    public static void main(String [] args){
           newCheck m = new newCheck();
           String str = "JAVA";
           System.out.println("Repeating string : " + m.repeater(str));


    }

}
