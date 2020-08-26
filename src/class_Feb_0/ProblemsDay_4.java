package class_Feb_0;

import java.util.Scanner;
public class ProblemsDay_4
{
    public static void main(String[] args)
    {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter age: ");
        int Age = myScanner.nextInt();

        if (Age <= 0)
        {
            System.out.print("The number is negative or zero");
        }
        else if (Age > 120)
        {
            System.out.print("The number is unreal");
        }
        else
        {
            System.out.print("The number is realistic");
        }
    }
}