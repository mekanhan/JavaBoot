package Assignments;
import java.util.*;

public class HW4_Weight_Shipping {
    public static void main(String[] args){
        //Weight between 1-5lbs = 12pt
        //...            6-12lbs = 29pt
        //...            13+ lbs = 50pt
        // Volume 5-10 = 20pt
        // ...    11-20 = 45pt
        //Distance as mile


        System.out.println("Enter weight: ");
        Scanner weightIn = new Scanner(System.in);
        int weight= weightIn.nextInt();

        System.out.println("Enter volume: ");
        Scanner volumeIn = new Scanner(System.in);
        int volume= volumeIn.nextInt();

        System.out.println("Enter distance in miles: ");
        Scanner milesIn = new Scanner(System.in);
        int miles = milesIn.nextInt();

        System.out.println("Ground or Urgent delivery? (G/U) ");
        Scanner deliveryIn = new Scanner(System.in);
        String delivery = deliveryIn.next();

        //Weight
        int weightPoints;
        if (weight<6){
            weightPoints=12;
        }
        else if (weight>6 && weight<13){
            weightPoints=29;
        }
        else if (weight>13){
            weightPoints=50;
        }
        else if (weight<0){
            System.out.println("Weight can not be negative value");

        }

        // Volume
        int volumePoints;
        if (volume>5 && volume<11){
            volumePoints=20;
        }
        else if (volume>11 && volume<20){
            volumePoints=45;
        }
        else {
            System.out.println("Volume value must be between 1-20");
        }


        //Calculations:
        if (delivery.equalsIgnoreCase("G")){
            double groundPrice= ((weight*volume)/11)*(miles/100);
            System.out.println("Your total is " + groundPrice);
        }
        else if (delivery.equalsIgnoreCase("U")){
            double urgentPrice= ((weight*volume)/5)*(miles/100);
            System.out.println("Your total is " + urgentPrice);
        }
        else {
            System.out.println("Please choose G for Ground or U for Urgent");

        }

    }
}
