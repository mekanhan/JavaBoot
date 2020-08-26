package class_Feb_0;
import java.util.Scanner;
public class Conversion
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the temperature? ");
        int celciusDegree = myScanner.nextInt();

        System.out.println("Fahrenheit : " + (celciusDegree*9/5+32));
    /*
        int a = 100;
        int b= 20;
        b = a+b;
        System.out.println("a:"+a+"b:"+b);

        String first = " H";
        String second = "R";

        String third = first + second;

        System.out.println(third);

*/

    }
}
