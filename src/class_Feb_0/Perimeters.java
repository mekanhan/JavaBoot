package class_Feb_0;
import java.util.Scanner;
public class Perimeters {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.print("Please enter shape: (1-Circle, 2-Rectangle, 3-Triangle)");

        int shape = x.nextInt();
        // Circle
        if (shape==1){
            System.out.println("Enter the radius ");
            double radius1 = x.nextInt();
            double PI_NUMBER = 3.14;
            double Calculations= 2*radius1*PI_NUMBER;

            System.out.format("%.2f", Calculations);
        }
        // Rectangle
        else if (shape==2){
            System.out.println("Enter the length ");
            int length = x.nextInt();
            System.out.println("Enter the width ");
            int width = x.nextInt();

            System.out.println("Perimeter for rectangle: " + 2*(width+length));
        }

        else if (shape==3){
            System.out.println("Enter the edge1 ");
            int edge1 = x.nextInt();
            System.out.println("Enter the edge2 ");
            int edge2 = x.nextInt();
            System.out.println("Enter the edge3 ");
            int edge3 = x.nextInt();
            System.out.println("perimeter of the triangle: " + (edge1+edge2+edge3));
        }
        else    {
            System.out.println("Please use a number from 1-3");
        }





    }
}
