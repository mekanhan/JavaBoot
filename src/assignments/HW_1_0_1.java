package assignments;
import java.util.Scanner;

public class HW_1_0_1
{
    // Design a program for a grocery store. Ask at least 3 items id and quantity to user

    public static void main(String[] args) {
        //Display list of items for user
        System.out.println("\t \t ID \t Description \t Prices: \n");
        System.out.println("\t \t 123 \t Banana     \t  $2.49 \n");
        System.out.println("\t \t 124 \t Apple      \t  $4.79 \n");
        System.out.println("\t \t 125 \t Peach      \t  $1.65 \n");
        System.out.println("\t \t 126 \t Tomato     \t  $7.88 \n");
        System.out.println("\t \t 127 \t Potato     \t  $0.99 \n");
        //Request user for input
        System.out.println("Choose item ID from 123 - 127. \nPlease enter item ID of the 1st item:\n");
        Scanner input = new Scanner(System.in);
        float itemId1 = input.nextFloat();
        System.out.println("Please enter quantity:\n");
        float quantity1 = input.nextInt();
        System.out.println("Please enter item ID of the 2nd item:\n");
        float itemId2;
        itemId2 = input.nextInt();
        System.out.println("Please enter quantity:\n");
        float quantity2 = input.nextFloat();
        System.out.println("Please enter item ID of the 3rd item:\n");
        float itemId3 = input.nextFloat();
        System.out.println("Please enter quantity:\n");
        float quantity3 = input.nextFloat();
            // Cost
        double cost123 = 2.49;
        double cost124 = 4.79;
        double cost125 = 1.65;
        double cost126 = 7.88;
        double cost127 = 0.99;

        //Print the top of receipt
        System.out.println("-------------Walmark Receipt----------------");

        System.out.println("--------------------------------------------");

        System.out.println( "Item ID: " + "\t" + (itemId1) + " \t \t " + (itemId2) + " \t \t " + (itemId3));
        System.out.println( "Quantity:" + "\t" + (quantity1)  + " \t \t " + (quantity2) + " \t \t " + (quantity3));
        //Process calculations and print results
                             //itemId1
        if (itemId1 == 123) {
           double TotalResult123 = quantity1*cost123;
            System.out.println("Price: ");
            System.out.format("\t       $%.2f", TotalResult123 );
        }
        else if (itemId1 == 124) {
            double TotalResult124= quantity1*cost124;
            System.out.format("$%.2f", TotalResult124);
        }
        else if (itemId1 == 125) {
            double TotalResult125= quantity1*cost125;
            System.out.format("$%.2f", TotalResult125);
        }
        else if (itemId1 == 126) {
            double TotalResult126= quantity1*cost126;
            System.out.format("$%.2f", TotalResult126);
        }
        else if (itemId1 == 127) {
            double TotalResult127= quantity1*cost127;
            System.out.format("$%.2f", TotalResult127);
        }
                                //itemId2
        if (itemId2 == 123) {
            double TotalResult223= quantity2*cost123;
            System.out.format("\t \t $%.2f", TotalResult223);
        }
        else if (itemId2 == 124) {
            double TotalResult224= quantity2*cost124;
            System.out.format("\t \t$%.2f", TotalResult224);
        }
        else if (itemId2 == 125) {
            double TotalResult225= quantity2*cost125;
            System.out.format("\t \t$%.2f", TotalResult225);
        }
        else if (itemId2 == 126) {
            double TotalResult226= quantity2*cost126;
            System.out.format("\t \t$%.2f", TotalResult226);
        }
        else if (itemId2 == 127) {
            double TotalResult227= quantity2*cost127;
            System.out.format("\t \t$%.2f", TotalResult227);
        }
                                //itemId3
        if (itemId3 == 123) {
            double TotalResult323= quantity3*cost123;
            System.out.format("\t \t $%.2f", TotalResult323);
        }
        else if (itemId3 == 124) {
            double TotalResult324= quantity3*cost124;
            System.out.format("\t \t $%.2f", TotalResult324);
        }
        else if (itemId3 == 125) {
            double TotalResult325= quantity3*cost125;
            System.out.format("\t \t $%.2f", TotalResult325);
        }
        else if (itemId3 == 126) {
            double TotalResult326= quantity3*cost126;
            System.out.format("\t \t $%.2f", TotalResult326);
        }
        else if (itemId3 == 127) {
            double TotalResult327= quantity3*cost127;
            System.out.format("\t \t $%.2f", TotalResult327);
        }


       //Unable to Print > System.out.println("TOTAL" + TotalResult1+ TotalResult2+TotalResult3);

        System.out.println("\n-------------------------------------------");
        System.out.println("\n      Thanks for shopping at WalmarK" +
                "\n----------------Walmark.COM----------------");

    }
}
