package w3resource;
import java.util.Scanner;

public class Q33_SumOf_Digits_Long {
    public static void main(String[] args){

        System.out.println("Please enter a number: ");
        Scanner in1 = new Scanner(System.in);
        long input1 = in1.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(input1) );

    }
    public static int sumDigits(long input1){
        int sum=0;
        while(input1!=0){
            sum +=input1 %10;
            input1 /=10;
        }
        return sum;
    }
}
