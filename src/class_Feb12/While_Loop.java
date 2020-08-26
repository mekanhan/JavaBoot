package class_Feb12;
import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        int a = 50;
        Scanner x = new Scanner(System.in);
        int c=0;
        while(!(c==1)) {
            System.out.print("Enter a number ");
            int b = x.nextInt();
            if (b > a) {
                System.out.println("Number is big. Try again.");
            } else if (b < a) {
                System.out.println("Number is small. Try again.");
            } else {
                System.out.println("Congratulations!!!");
                c = 1;  //inverse of while
            }
        }
    }
}
