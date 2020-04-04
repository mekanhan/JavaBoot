package Class_Feb_0;
import java.util.Scanner;

public class IfMillenium
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        int year = myScanner.nextInt();
        if(year>=2000)
        {
            System.out.println("After Millenium");
        }
        else
        {
            System.out.println("Before Millenium");
        }
    }
}
