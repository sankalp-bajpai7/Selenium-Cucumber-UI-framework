package edBitExercise;

public class findDiscount {

    public static double finalPrice(int p, int dis) {
        //int discount = (float) p * (float) dis/100 ;
        double discount = p * dis /100.0 ;
        double price = p - discount;

        return price;
    }

    public static void main (String[] args) {
        int originalPrice = 89;
        int disPercent = 20;
        System.out.println("Price after discount is : " +finalPrice(originalPrice,disPercent));
    }

}
