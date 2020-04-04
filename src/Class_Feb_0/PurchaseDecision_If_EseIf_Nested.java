package Class_Feb_0;
import java.util.Scanner;
public class PurchaseDecision_If_EseIf_Nested {
    public static void main(String[] args){
        //Color item: Red = 20, Blue = 10
        //Price: Tag price
        //Discount: Percentage
        //Point of the item = Tag price * Percentage - color

        double TagPrice;
        double percentage;
        double colorValue = 0;

        Scanner priceTag = new Scanner(System.in);
        System.out.print("Please enter discount percentage between 01 - 0.9: " );
        double priceTag1 = priceTag.nextDouble();

        Scanner Discount = new Scanner(System.in);
        System.out.print("Please enter discount amount: " );
        double Discount1 = Discount.nextDouble();

        Scanner color = new Scanner(System.in);
        System.out.print("Blue or Red: ");
        String color1 = color.nextLine();

        if (color1.compareToIgnoreCase("Red")==0){
            colorValue = 20;
            double point = Discount1*priceTag1 - colorValue;
            if (point>=100){
                System.out.println(point);
                System.out.println("Do not Buy");
            }
            else if( (point>=50&&point<=99)){
                System.out.println(point);
                System.out.println("Buy later");
            }
            else if (point<50) {
                System.out.println(point);
                System.out.println("Buy it now!!!");
            }
        }
        else if (color1.compareToIgnoreCase("Blue")==0){
            colorValue = 10;

        double point = Discount1*priceTag1 - colorValue;
            if (point>=100){
                System.out.println(point);
                System.out.println("Do not Buy");
            }
            else if( (point>=50&&point<=99)){
                System.out.println(point);
                System.out.println("Buy later");
            }
            else if (point<50) {
                System.out.println(point);
                System.out.println("Buy it now!!!");
            }
        }
        else  {
            System.out.println("Color not found!!!");
        }


    }

}
