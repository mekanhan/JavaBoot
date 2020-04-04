package Assignments;
import java.util.Scanner;

public class HW_1
{
    // Design a program for a grocery store. Ask at least 3 items id and quantity to user

    public static void main(String[] args) {

        System.out.println("\t \t id prices: \n");
        System.out.println("\t \t 123:$2.49 \n");
        System.out.println("\t \t 124:$4.79 \n");
        System.out.println("\t \t 125:$1.65 \n");
        System.out.println("\t \t 126:$7.88 \n");
        System.out.println("\t \t 127:$0.99 \n");
        System.out.println("Choose item ID from 123 - 127. \n Please enter item ID of the 1st item:\n");
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


        System.out.println("-------Walmark Receipt--------");
        System.out.println("item id \t quantity \t price");
        System.out.println("------------------------------");

        System.out.println( (itemId1) + " \t \t " + (itemId2) + " \t \t " + (itemId3));
        System.out.println( (quantity1)  + " \t \t \t " + (quantity2) + " \t \t \t " + (quantity3));


        double TotalResult123 = quantity1*cost123;
        double TotalResult124 = quantity1*cost124;
        double TotalResult125 = quantity1*cost125;
        double TotalResult126 = quantity1*cost126;
        double TotalResult127 = quantity1*cost126;
        double TotalResult223 = quantity2*cost123;
        double TotalResult224 = quantity2*cost124;
        double TotalResult225 = quantity2*cost125;
        double TotalResult226 = quantity2*cost126;
        double TotalResult227 = quantity2*cost127;
        double TotalResult323 = quantity3*cost123;
        double TotalResult324 = quantity3*cost124;
        double TotalResult325 = quantity3*cost125;
        double TotalResult326 = quantity3*cost126;
        double TotalResult327 = quantity3*cost127;

        //itemId1
        if (itemId1 == 123) {
           TotalResult123 = quantity1*cost123;
            System.out.format("$%.2f", TotalResult123);
        }
        else if (itemId1 == 124) {
            TotalResult124= quantity1*cost124;
            System.out.format("$%.2f", TotalResult124);
        }
        else if (itemId1 == 125) {
            TotalResult125= quantity1*cost125;
            System.out.format("$%.2f", TotalResult125);
        }
        else if (itemId1 == 126) {
            TotalResult126= quantity1*cost126;
            System.out.format("$%.2f", TotalResult126);
        }
        else if (itemId1 == 127) {
            TotalResult127= quantity1*cost127;
            System.out.format("$%.2f", TotalResult127);
        }
        //itemId2
        if (itemId2 == 123) {
            TotalResult223= quantity2*cost123;
            System.out.format("$%.2f", TotalResult223);
        }
        else if (itemId2 == 124) {
            TotalResult224= quantity2*cost124;
            System.out.format("$%.2f", TotalResult224);
        }
        else if (itemId2 == 125) {
            TotalResult225= quantity2*cost125;
            System.out.format("$%.2f", TotalResult225);
        }
        else if (itemId2 == 126) {
            TotalResult226= quantity2*cost126;
            System.out.format("$%.2f", TotalResult226);
        }
        else if (itemId2 == 127) {
            TotalResult227= quantity2*cost127;
            System.out.format("$%.2f", TotalResult227);
        }
        //itemId3
        if (itemId3 == 123) {
            TotalResult323= quantity3*cost123;
            System.out.format("$%.2f", TotalResult323);
        }
        else if (itemId3 == 124) {
            TotalResult324= quantity3*cost124;
            System.out.format("$%.2f", TotalResult324);
        }
        else if (itemId3 == 125) {
            TotalResult325= quantity3*cost125;
            System.out.format("$%.2f", TotalResult325);
        }
        else if (itemId3 == 126) {
            TotalResult326= quantity3*cost126;
            System.out.format("$%.2f", TotalResult326);
        }
        else if (itemId3 == 127) {
            TotalResult327= quantity3*cost127;
            System.out.format("$%.2f", TotalResult327);
        }

        //in Results the TotalResult(s) give error

        // System.out.println("TOTAL" + TotalResult1+ TotalResult2+TotalResult3);


        System.out.println("\n  Thanks for shopping with Us" +
                "\n--------Walmark Receipt--------");
    }
}
