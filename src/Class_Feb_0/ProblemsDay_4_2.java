package Class_Feb_0;

import java.util.Scanner;

public class ProblemsDay_4_2
{
    public static void main(String[] args) {
                //<20 is Winter
                //21-40 is Fall
                //41-60 is Spring
                //61> is Summer
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter a temperature: ");
        int temp = myScanner.nextInt();

        if (temp <= 20) {
            System.out.print("It is Winter");
        }
        else if ((21<temp) && (temp<40) ) {
            System.out.print("It is Fall");
        }
        else if ((41<temp) && (temp<60) ) {
            System.out.print("It is Spring");
        }
        else {
            System.out.print("It is Summer");
        }

    }
}
