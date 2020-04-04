package Class_Feb_0;

import java.util.Scanner;

public class OddNumber
{
    // "ask use to enter the integer and then print "odd" if the number is odd

     public static void main(String[] args)
    {
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = Number.nextInt();
        if (!(0==n1%2))
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }


    }
}
