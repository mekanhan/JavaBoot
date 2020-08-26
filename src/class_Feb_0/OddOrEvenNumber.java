package class_Feb_0;

import java.util.Scanner;

public class OddOrEvenNumber
{
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int number;
        System.out.print("Please enter a number: ");
        number = myScanner.nextInt();

        if (number % 2 == 1)
        {
            System.out.print(number +" is an odd number");
        } else {
            System.out.print(number +" is an even number");
        }
    }
}
