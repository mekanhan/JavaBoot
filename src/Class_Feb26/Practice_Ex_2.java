package Class_Feb26;
import java.util.*;

public class Practice_Ex_2 {

    public static void main(String[] args) {

        // bin 10 + bin 11 = 101
        String b1,b2;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st binary no. : ") ;
        b1=sc.next();
        System.out.println("Enter 2nd binary no. : ") ;
        b2=sc.next();
        int num1=Integer.parseInt(b1,2);
        int num2=Integer.parseInt(b2,2);
        int sum=num1+num2;
        System.out.println("Addition is : "+Integer.toBinaryString(sum));

    }

}
