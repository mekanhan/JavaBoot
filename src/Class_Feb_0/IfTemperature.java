package Class_Feb_0;

import java.util.Scanner;

 /// wear jacket if under 30 degrees;

public class IfTemperature
{
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int number;
        System.out.print("Please enter a temperature: ");
        number = myScanner.nextInt();

        if (number <30)
        {
            System.out.print("Wear a jacket because it is below 30 degrees");
        } else {
            System.out.print("Don't wear a jacket because it is warmer than 30 degrees");
        }
    }
}
